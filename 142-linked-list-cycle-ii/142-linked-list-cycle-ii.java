/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
    // TODO: Write your code here
    if(head==null) return null;
    ListNode slow=head;
    ListNode fast=head;
    int K=-1;
    while(fast!=null&&fast.next!=null){
      fast=fast.next.next;
      slow=slow.next;
      if(slow==fast) {
          K=getLength(slow);
          break;
      }
    }
    if(K==-1) return null;
    return getHead(head,K);
  }
  private  int getLength(ListNode slow){
    ListNode curr=slow.next;
    int count =1;
    while(curr!=slow){
      curr=curr.next;
      count++;
    }
    return count;
  }
  private  ListNode getHead(ListNode head,int K){
    ListNode pointer1=head,pointer2=head;
    while(K>0){
      pointer2=pointer2.next;
      K--;
    }
    while(pointer1!=pointer2) {
      pointer1=pointer1.next;
      pointer2=pointer2.next;
    }
    return pointer1;
  }
}