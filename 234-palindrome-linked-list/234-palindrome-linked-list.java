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
    // public boolean isPalindrome(ListNode head) {
    // if(head==null) return false;
    // ListNode slow=head;
    // ListNode fast=head;
    // while(fast!=null&&fast.next!=null){
    //   fast=fast.next.next;
    //   slow=slow.next;
    // }
    // Stack<Integer> stack=new Stack<>();
    // ListNode middle=slow;
    // while(slow!=null){
    //    stack.add(slow.val);
    //    slow=slow.next;
    // }
    // slow=head;
    // while(slow!=middle){
    //   if(slow.val!=stack.pop()) return false;
    //   slow=slow.next;
    // }
    // return true;
    // }
     public boolean isPalindrome(ListNode head) {
        if(head==null) return false;
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode secondHalf=reverse(slow);
        ListNode copySecondHalf=secondHalf;
        while (head!=null&&secondHalf!=null){
            if(head.val!=secondHalf.val) return false;
            head=head.next;
            secondHalf=secondHalf.next;
        }
      return true;
    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        while (head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}