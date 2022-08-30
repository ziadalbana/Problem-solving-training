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
    public List<List<Integer>> levelOrder(TreeNode root) {
    if(root==null) return new ArrayList<List<Integer>>();   
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    Queue<TreeNode> queue=new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
      int levelSize=queue.size();
      List<Integer> level=new ArrayList<>();
      for(int i=0;i<levelSize;i++){
        TreeNode temp=queue.poll();
        level.add(temp.val);
        if(temp.left!=null) queue.add(temp.left);
        if(temp.right!=null) queue.add(temp.right);
      }
      result.add(level);
    }
    return result; 
    }
}