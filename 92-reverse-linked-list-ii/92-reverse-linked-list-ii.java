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
    public ListNode reverseBetween(ListNode head, int p, int q) {
        if(head==null||p==q) return head;
        int count=1;
        ListNode curr=head;
        ListNode prev=null;
        for (int i = 0;curr!=null&&i<p-1 ; i++){
            prev=curr;
            curr=curr.next;
        }
        ListNode lastOfFirst=prev;
        ListNode lastofReverse=curr;
        prev=null;
        for (int i = 0;curr!=null&&i < q-p+1; i++) {
            ListNode next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        if(lastOfFirst!=null) lastOfFirst.next=prev;
        else head=prev;
        lastofReverse.next=curr;
        return head;
    }
}