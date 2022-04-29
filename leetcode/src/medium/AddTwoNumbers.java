package medium;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode temp1=new ListNode(9,new ListNode(9, new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,null)))))));
        ListNode temp2=new ListNode(9,new ListNode(9, new ListNode(9,new ListNode(9,null))));
        AddTwoNumbers b=new AddTwoNumbers();
        b.addTwoNumbers(temp1,temp2);
    }

      //Definition for singly-linked list.
      public static class ListNode {
          int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode result=new ListNode();
          ListNode current=result;
          int carry=0;
          int val= l1.val+l2.val;
          result.val=((int)val%10);
          carry=val/10;
          l1=l1.next;
          l2=l2.next;
          while (l1!=null&&l2!=null){
              val= l1.val+l2.val+carry;
              current.next=new ListNode((val%10),null);
              carry=val/10;
              l1=l1.next;
              l2=l2.next;
              current=current.next;
          }
          while (l1==null&&l2!=null){
              val=l2.val+carry;
              current.next=new ListNode((val%10),null);
              carry=val/10;
              l2=l2.next;
              current=current.next;
          }
        while (l1!=null&&l2==null){
             val=l1.val+carry;
            current.next=new ListNode((val%10),null);
            carry=val/10;
            l1=l1.next;
            current=current.next;
        }
        if(carry>0) current.next=new ListNode(carry,null);
        return result;
    }
}
