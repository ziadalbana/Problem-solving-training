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
        if(head==null) return null;
        ListNode pointer=head;
        int count=0;
        while(pointer!=null){
            count++;
            pointer=pointer.next;
        }
        int target=count-n;
        ListNode curr=head;
        ListNode prev=curr;
        if(target==0){
            head=head.next;
            return head;
        }
        for(int i=0;i<target;i++){
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
        return head;
    }
}