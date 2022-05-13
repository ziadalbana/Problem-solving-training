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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        int size=0;
        while(fast!=null){
            size++;
            fast=fast.next;
        }
        // if(size<=1){
        //     head=null;
        //     return head;
        // }
        fast=head;
        int count=0;
        while(fast!=null){
            if((size-n)==0) {
                head=fast.next;
                break;
            }
            else if(count==(size-n)){
                slow.next=fast.next;
                break;
            }
            count++;
            slow=fast;
            fast=fast.next;
        }
        return head;
    }
}