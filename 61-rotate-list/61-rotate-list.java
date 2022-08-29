/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
    if(head==null||head.next==null||k==0)  return head;
    ListNode prev=null;
    ListNode curr=head;
    int len=0;
    while(curr!=null){
      prev=curr;
      curr=curr.next;
      len+=1;
    }
    prev.next=head;
    k%=len;
    prev=null;curr=head;
    for(int i=0;i<len-k;i++){
      prev=curr;
      curr=curr.next;
    }
    prev.next=null;
    head=curr;

    return head;
        
    }
}