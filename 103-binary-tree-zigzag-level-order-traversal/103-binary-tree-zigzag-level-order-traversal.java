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
   public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    if(root==null) return new ArrayList<List<Integer>>();   
   List<List<Integer>> result = new ArrayList<List<Integer>>();
    // TODO: Write your code here
    Queue<TreeNode> queue=new LinkedList<>();
    queue.add(root);
    boolean leftToRight=true;
    while(!queue.isEmpty()){
      int levelSize=queue.size();
      ArrayList<Integer> level=new ArrayList<>();
      for(int i=0;i<levelSize;i++){
        TreeNode temp=queue.poll();
        if(leftToRight) level.add(temp.val);
        else level.add(0,temp.val);
        if(temp.left!=null) queue.add(temp.left);
        if(temp.right!=null) queue.add(temp.right);
      }
      result.add(level);
      leftToRight=!leftToRight;
    }
    return result;
   }
}