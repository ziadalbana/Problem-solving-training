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
    public int pathSum(TreeNode root, int targetSum) {
    
    return traverse(root,targetSum,new ArrayList<>());
  }
  private static int traverse(TreeNode root, int S,List<Integer> path){
   if(root==null) return 0;
   int pathsCount=0;
    long sum=0;
   path.add(root.val);
   for(int i=path.size()-1;i>=0;i--){
     sum+=path.get(i);
     if(sum==S) pathsCount++;
   }
   pathsCount+=traverse(root.left,S,path);
   pathsCount+=traverse(root.right,S,path);
   path.remove(path.size()-1);
   return pathsCount;
  }
}