package medium;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {
       // TreeNode n=new TreeNode(1,new TreeNode(2,new TreeNode(4),null),new TreeNode(3,null,new TreeNode(5)));
        TreeNode n=new TreeNode(1,new TreeNode(2),null);
       BinaryTreeZigzagLevelOrderTraversal m=new BinaryTreeZigzagLevelOrderTraversal();
        m.zigzagLevelOrder(n);
    }

     // Definition for a binary tree node.
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
      public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
          List<List<Integer>> result=new ArrayList<>();
          if (root==null) return new ArrayList<>();
          Stack<TreeNode> nodes=new Stack<>();
          nodes.add(root);
          Queue<Integer> visited=new LinkedList<>();
          visited.add(root.val);
          int level=0;
          while (!nodes.isEmpty()){
              int size= (int) Math.pow(2,level);
              for (int j = 0; j < size &&!nodes.isEmpty() ; j++) {
                  TreeNode node=nodes.pop();
                  if (level%2!=0){
                  if (node.left==null) visited.add(-102);
                  else {
                      if (node.left!=null) nodes.add(node.left);
                          visited.add(node.left.val);

                  }
                  if (node.right==null) visited.add(-102);
                  else {
                      if (node.right!=null) nodes.add(node.right);
                      visited.add(node.right.val);

                  }
                  }else {
                      if (node.right==null) visited.add(-102);
                      else {
                          if (node.right!=null) nodes.add(node.right);
                          visited.add(node.right.val);
                      }
                      if (node.left==null) visited.add(-102);
                      else {
                          if (node.left!=null) nodes.add(node.right);
                          visited.add(node.left.val);
                      }
                  }
              }
              level++;
          }
          level=0;
          while (!visited.isEmpty()){
              List<Integer> temp=new ArrayList<>();
              int size= (int) Math.pow(2,level);
              for (int j = 0; j < size &&!visited.isEmpty() ; j++) {
                  if (visited.peek()!=-102) temp.add(visited.poll());
                  else visited.poll();
              }
              if (temp.size()>0) result.add(temp);
              level++;
          }
          return result;
       }
}
