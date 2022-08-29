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
    public ListNode reverseKGroup(ListNode head, int k) {
         ListNode current=head;
        ListNode lastOfDone=null;
        ListNode lastOfRervsed=null;
        while(current!=null){
            int count=0;
            ListNode prev=null;
            lastOfRervsed=current;
            while(current!=null&&count<k){
                ListNode next=current.next;
                current.next=prev;
                prev=current;
                current=next;
                count++;
            }
            if(count<k){
                current =prev;prev=null;
                lastOfRervsed=current;
                while(current!=null){
                ListNode next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }
                lastOfDone.next=prev;
                lastOfRervsed.next=null;
                
            }else{
            if(lastOfDone==null) head=prev;
            else lastOfDone.next=prev;
            lastOfDone=lastOfRervsed;
            lastOfRervsed.next=current;
            }
        }
        return head;
    }
}