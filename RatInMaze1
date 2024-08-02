class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        ArrayList<String> res = new ArrayList<>();
        if(mat == null || mat[0][0] == 0) {
            res.add("-1");
            return res;
        }
        dfs(mat, 0, 0, "", res, new boolean[mat.length][mat.length]);
        Collections.sort(res);
        if(res.isEmpty()) {
            res.add("-1");
        }
        return res;
    }
    
    private void dfs(int[][] mat, int x, int y, String path, ArrayList<String> res, boolean[][] visited) {
        int n = mat.length;
        if(x<0 || x>=n || y<0 || y>=n || mat[x][y]==0 || visited[x][y]) {
            return;
        }
        if(x == n-1 && y == n-1) {
            res.add(path);
            return;
        }
        
        visited[x][y] = true;
        dfs(mat, x+1, y, path+"D", res, visited); // Down
        dfs(mat, x-1, y, path+"U", res, visited); // Up
        dfs(mat, x, y+1, path+"R", res, visited); // Right
        dfs(mat, x, y-1, path+"L", res, visited); // Left
        visited[x][y] = false;
    }
    
}
