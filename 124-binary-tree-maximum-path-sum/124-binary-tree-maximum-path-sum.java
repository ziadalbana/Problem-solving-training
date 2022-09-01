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
   int maxSum=Integer.MIN_VALUE;
   public int maxPathSum(TreeNode root) {
    maxSum=Integer.MIN_VALUE;
    getMaxSum(root);
    return maxSum;
  }
  private int getMaxSum(TreeNode root){
    if(root==null) return 0;
    int leftSum=Integer.max(getMaxSum(root.left),0);
    int rightSum=Integer.max(getMaxSum(root.right),0);
    maxSum=Integer.max(maxSum,(leftSum+rightSum)+root.val);
    return Integer.max(leftSum,rightSum)+root.val;
  }
}