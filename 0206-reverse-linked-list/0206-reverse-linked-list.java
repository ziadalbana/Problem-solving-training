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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
        // ListNode h1=head;
        // ListNode result=null;
        // while(h1!=null){
        //    ListNode temp=new ListNode(h1.val);
        //     temp.next=result;
        //     h1=h1.next;
        //     result=temp;
        // }
        // return result;
        // ListNode prev=null;
        // while(head!=null){
        //     ListNode next=head.next;
        //     head.next=prev;
        //     prev=head;
        //     head=next;
        // }
        // return prev;
    }
}