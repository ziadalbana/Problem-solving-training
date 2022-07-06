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
    public Node connect(Node root) {
        if(root==null) return null;
        Node temp=new Node();
        Node pre=temp;
        Node result=root;
        while(root!=null){
            if(root.left!=null){
                pre.next=root.left;
                pre=pre.next;
            }
            if(root.right!=null){
                pre.next=root.right;
                pre=pre.next;
            }
            root=root.next;
            if(root==null){
                pre=temp;
                root=temp.next;
                temp.next=null;
            }
            
        }
        return result;
    }
}