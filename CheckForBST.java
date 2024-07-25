

// User function Template for Java

class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        // code here.
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        return fun(root, min, max);
    }
    
    boolean fun(Node node, int min, int max){
        if(node == null){
            return true;
        }
        if(node.data <= min || node.data >= max){
            return false;
        }
        return fun(node.left, min, node.data) && fun(node.right, node.data, max);
    }
    
}
