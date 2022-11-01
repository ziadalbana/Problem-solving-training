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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode h1=list1;
        ListNode h2=list2;
        ListNode result=new ListNode();
        ListNode pointer =result;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        while(h1!=null&&h2!=null){
            if(h1.val<=h2.val){
              if(result==null) result=h1;
            else{
                result.next=h1;
                result=result.next;
                }
                h1=h1.next;
            }else {
                if(result==null) result=h2;
                else{
                result.next=h2;
                result=result.next;
                }
                h2=h2.next;
            }
        }
        while(h1!=null){
            result.next=h1;
            result=result.next;
            h1=h1.next;
        }
        while(h2!=null){
            result.next=h2;
            result=result.next;
            h2=h2.next;
        }
        return pointer.next;
    }
}