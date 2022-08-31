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
        // List<Integer> paths=new ArrayList<>();
        // traverse(root,paths,0);
        // int res=0;
        // for(int n:paths) res+=n;
        return findRootToLeafPathNumbers(root,0);
    }
    // private void traverse(TreeNode root,List<Integer> paths,int path){
    //     if(root==null) return;
    //     path=(path*10)+root.val;
    //     if(root.left==null&&root.right==null) paths.add(path);
    //     else {
    //         traverse(root.left,paths,path);
    //         traverse(root.right,paths,path);
    //     }
    //     path/=10;
    // }
     private static int findRootToLeafPathNumbers(TreeNode currentNode, int pathSum) {
    if (currentNode == null)
      return 0;

    pathSum = 10 * pathSum + currentNode.val;

    if (currentNode.left == null && currentNode.right == null) {
      return pathSum;
    }

    // traverse the left and the right sub-tree
    return findRootToLeafPathNumbers(currentNode.left, pathSum) +
           findRootToLeafPathNumbers(currentNode.right, pathSum);
  }
}