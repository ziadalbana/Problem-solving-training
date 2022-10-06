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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null) return null;
        reverse(root.left,root.right,1);
        return root;
    }
    private void reverse(TreeNode leftNode,TreeNode rightNode,int level){
        if(leftNode==null||rightNode==null) return;
        if(level%2==1){
            int temp=leftNode.val;
            leftNode.val=rightNode.val;
            rightNode.val=temp;
        }
        reverse(leftNode.left,rightNode.right,level+1);
        reverse(leftNode.right,rightNode.left,level+1);
    }
}