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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        boolean odd=true;
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                TreeNode node=queue.poll();
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            if(odd){
                Stack<Integer> stack=new Stack<>();
                for(TreeNode node:queue){
                   stack.add(node.val);
                }
                for(TreeNode node:queue){
                    node.val=stack.pop();
                }
            }
            odd=!odd;
        }
        return root;
    }
}