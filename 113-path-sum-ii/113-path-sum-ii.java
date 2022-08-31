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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
      List<List<Integer>> allPaths = new ArrayList<>();
        if(root==null) return allPaths;
        traverse(root,targetSum,allPaths,new ArrayList<>());
        return allPaths;
    }
    private static void traverse(TreeNode root, int sum,List<List<Integer>> allPaths,List<Integer> path){
        if(root==null) return ;
        path.add(root.val);
        if(root.val==sum&&root.right==null&&root.left==null) allPaths.add(new ArrayList<>(path));
        else {
            traverse(root.left,sum-root.val,allPaths,path);
            traverse(root.right,sum-root.val,allPaths,path);
        }
        path.remove(path.size()-1);
    }
}