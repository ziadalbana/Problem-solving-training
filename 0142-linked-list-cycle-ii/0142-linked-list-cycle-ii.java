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
        ListNode slow=head;
        ListNode fast=head;
        int k=-1;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                k=getLength(slow);
                break;
            }
        }
        if(k==-1) return null;
        return getNode(k,head);
    }
    private int getLength(ListNode slow){
        int count=0;
        ListNode pointer=slow.next;
        while(pointer!=slow){
            pointer=pointer.next;
            count++;
        }
        return count;
    }
    private ListNode getNode(int k,ListNode head){
        ListNode pointer1=head;
        ListNode pointer2=head;
        while(k>=0){
             pointer2=pointer2.next;
            k--;
        } 
        while(pointer1!=pointer2){
            pointer1=pointer1.next;
            pointer2=pointer2.next;
        }
        return pointer1;
    }
}