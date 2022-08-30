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
    public int minDepth(TreeNode root) {
            if(root==null) return 0;
    Queue<TreeNode> queue=new LinkedList<>();
    queue.add(root);
    int shortest=1;
    while(!queue.isEmpty()){
      int levelSize=queue.size();
      for(int i=0;i<levelSize;i++){
       TreeNode temp=queue.poll();
       if(temp.right==null&&temp.left==null) return shortest;
       if(temp.left!=null) queue.offer(temp.left);
       if(temp.right!=null) queue.offer(temp.right);
      }
      shortest++;
    }
    return -1;
    }
}