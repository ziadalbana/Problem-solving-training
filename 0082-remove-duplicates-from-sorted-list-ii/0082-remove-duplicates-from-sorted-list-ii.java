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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode slow=new ListNode(0,head);
        ListNode fast=slow;
        while(head!=null){
            if(head.next!=null&&head.val==head.next.val){
                while(head.next!=null&&head.val==head.next.val) head=head.next;
                fast.next=head.next;
            }else{
                fast=fast.next;
            }
            head=head.next;
        }
        return slow.next;
    }
}