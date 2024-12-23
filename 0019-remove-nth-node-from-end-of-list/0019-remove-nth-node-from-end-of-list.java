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
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        int target=count-n-1;
        ListNode prev=new ListNode(0,head);
        ListNode pointer=prev;
        for(int i=0;i<=target;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return pointer.next;
        
    }
}