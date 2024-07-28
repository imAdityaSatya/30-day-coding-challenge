class Solution{
    static int countMin(String str) {
        // code here
        int n = str.length();
        String s="";
        for(int i=0; i<n; i++) {
            s = str.charAt(i) + s;
        }
        int dp[][] = new int[n+1][n+1];
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(str.charAt(i-1) == s.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return n - dp[n][n];
    }
}
