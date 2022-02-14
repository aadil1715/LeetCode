/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        
     
        Stack<TreeNode> nodeStack = new Stack<>();
        TreeNode curr = root;
        
        nodeStack.push(curr);
        
        while(nodeStack.size()!=0){
            TreeNode current_node = nodeStack.pop();
            
            if(current_node.left==null && current_node.right==null && targetSum == current_node.val){
                return true;
            }
            
           if(current_node.left!=null){
                current_node.left.val = current_node.left.val + current_node.val;
                nodeStack.push(current_node.left);
            }
            
            if(current_node.right!=null){
                current_node.right.val = current_node.right.val + current_node.val;
                nodeStack.push(current_node.right);
            }
        }
        return false;
    }
}