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
    public ListNode middleNode(ListNode head) {
        // ListNode slow=head;
        // ListNode fast=head;
        // ListNode result=new ListNode();
        // int size=0;
        // while(fast!=null){
        //     size++;
        //     fast=fast.next;
        // }
        // int count=0;
        // size/=2;
        // while(slow!=null){
        //     if(count==size){
        //         result=slow;
        //     }
        //     count++;
        //     slow=slow.next;
        // }
        // return result;
        ListNode slow=head;
    ListNode fast=head;
    while(fast!=null&&fast.next!=null){
      fast=fast.next.next;
      slow=slow.next;
    }
    return slow;
    }
}