/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}

*/
class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    
    public void fun(Node root, ArrayList<Integer> a){
        // ArrayList<Integer> a = new ArrayList<Integer>();
        if(root == null){
            return;
        }
        a.add(root.data);
        fun(root.right, a);
        fun(root.left, a);
    }
    
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        fun(root1, a);
        fun(root2, a);
        Collections.sort(a);
        return a;
    }
}
