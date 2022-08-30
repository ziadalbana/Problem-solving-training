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
    public List<Double> averageOfLevels(TreeNode root) {
    List<Double> result = new ArrayList<>();
    // TODO: Write your code here
    Queue<TreeNode> queue=new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
      int levelSize=queue.size();
      double sum=0;
      for(int i=0;i<levelSize;i++){
        TreeNode temp=queue.poll();
        sum+=temp.val;
        if(temp.left!=null) queue.add(temp.left);
        if(temp.right!=null) queue.add(temp.right);
      }
      sum/=levelSize;
      result.add(sum);
    }
    return result;
    }
}