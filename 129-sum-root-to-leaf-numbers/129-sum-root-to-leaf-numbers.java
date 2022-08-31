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
    public int sumNumbers(TreeNode root) {
        List<Integer> paths=new ArrayList<>();
        traverse(root,paths,0);
        int res=0;
        for(int n:paths) res+=n;
        return res;
    }
    private void traverse(TreeNode root,List<Integer> paths,int path){
        if(root==null) return;
        path=(path*10)+root.val;
        if(root.left==null&&root.right==null) paths.add(path);
        else {
            traverse(root.left,paths,path);
            traverse(root.right,paths,path);
        }
        path/=10;
    }
}