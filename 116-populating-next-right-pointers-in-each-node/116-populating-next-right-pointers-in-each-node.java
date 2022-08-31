/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    // public Node connect(Node root) {
    //     if(root==null) return null;
    //     if(root.left!=null) root.left.next=root.right;
    //     if(root.right!=null &&root.next!=null) root.right.next=root.next.left;
    //     connect(root.left);
    //     connect(root.right);
    //     return root;
    // }
    public Node connect(Node root) {
    if(root==null) return root;
    Queue<Node> queue=new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
      Node prev=null;
      int levelSize=queue.size();
      for(int i=0;i<levelSize;i++){
        Node curr=queue.poll();
        if(prev!=null) prev.next=curr;
        if(curr.left!=null) queue.offer(curr.left);
        if(curr.right!=null) queue.offer(curr.right);
        prev=curr;
      }
    }
    return root;    
        
    }
}