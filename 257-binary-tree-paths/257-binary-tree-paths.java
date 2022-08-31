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
         traverse(root,allPaths,new ArrayList<>());
        return allPaths;
    }
    private void traverse(TreeNode root,List<String> allPaths,List<Integer> path){
        if(root==null) return ;
        path.add(root.val);
        if(root.left==null&&root.right==null) {
            String handler="";
            for(int i=0;i<path.size();i++){
                if(i<path.size()-1) handler+=path.get(i)+"->";
                else handler+=path.get(i);
            }
            allPaths.add(handler);
        }else {
            traverse(root.left,allPaths,path);
            traverse(root.right,allPaths,path);
        }
        path.remove(path.size()-1);
    }
}