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
    // public int maxDepth(TreeNode root) {
    // if(root==null) return 0;
    // Queue<TreeNode> queue=new LinkedList<>();
    // queue.add(root);
    // int len=0;
    // while(!queue.isEmpty()){
    //   int levelSize=queue.size();
    //   for(int i=0;i<levelSize;i++){
    //    TreeNode temp=queue.poll();
    //    if(temp.left!=null) queue.offer(temp.left);
    //    if(temp.right!=null) queue.offer(temp.right);
    //   }
    //   len++;
    // }
    // return len;
    // }
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int leftLength=maxDepth(root.left);
        int rightLength=maxDepth(root.right);
        return Integer.max(leftLength,rightLength)+1;
        
        
    }
}