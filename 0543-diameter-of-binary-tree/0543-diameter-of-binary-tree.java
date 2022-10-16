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
    int maxDiamter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return maxDiamter;
    }
     private int getHeight(TreeNode root){
         if(root==null) return 0;
         int leftHeight=getHeight(root.left);
         int rightHeight=getHeight(root.right);
         maxDiamter=Integer.max(leftHeight+rightHeight,maxDiamter);
         return Integer.max(leftHeight,rightHeight)+1;
     }
    // int maxDiamter=0;
    // public int diameterOfBinaryTree(TreeNode root) {
    //     // TODO: Write your code here
    //     getHeight(root);
    //     return maxDiamter;
    // }
    // private int getHeight(TreeNode root){
    //     if(root==null) return 0;
    //     int leftHeight=getHeight(root.left);
    //     int rightHeight=getHeight(root.right);
    //     maxDiamter=Integer.max(leftHeight+rightHeight,maxDiamter);
    //     return Integer.max(leftHeight,rightHeight) +1;
    // }
}