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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> allPaths=new ArrayList<>();
         traverse(root,allPaths,new StringBuilder());
        return allPaths;
    }
    private void traverse(TreeNode root,List<String> allPaths,StringBuilder path){
        if(root==null) return ;
        int length=path.length();
        if(root.left==null&&root.right==null) {
            path.append(root.val);
            allPaths.add(path.toString());
        }else {
            path.append(root.val).append("->");
            traverse(root.left,allPaths,path);
            traverse(root.right,allPaths,path);
        }
        path.setLength(length);
    }
}