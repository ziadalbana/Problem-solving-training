package medium;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        //[1,2,3,4,5]
        //[1,2,3,4,5,6,7,8]
        ListNode n=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6,new ListNode(7,new ListNode(8))))))));
        OddEvenLinkedList m=new OddEvenLinkedList();
        m.oddEvenList(n);
    }
     // Definition for singly-linked list.
     public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode oddEvenList(ListNode head) {
        int i=1;
        ListNode endPointer=head;
        if(head==null) return head;
        else if(head.next==null) return head;
        else if(head.next.next==null) return head;
        while (endPointer.next!=null){
            i++;
            endPointer=endPointer.next;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        int count=2;
        while (count<=i){
            if (count%2==0){
                slow.next=fast.next;
                endPointer.next=fast;
                endPointer=endPointer.next;
                endPointer.next=null;
                slow=slow.next;
                fast=slow.next;
                count+=2;
            }else {
                fast=fast.next;
                count++;
            }
        }
        return head;
    }
}
