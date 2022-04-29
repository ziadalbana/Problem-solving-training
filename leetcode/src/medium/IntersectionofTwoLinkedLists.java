package medium;

public class IntersectionofTwoLinkedLists {

     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
          ListNode pointer1=headA;
          ListNode pointer2=headB;
          int s1=0,s2=0;
          if (headA==null||headB==null) return null;
          while (pointer1!=null){
              s1++;
              pointer1=pointer1.next;
          }
          while (pointer2!=null) {
              s2++;
              pointer2=pointer2.next;
          }
          int diff=Math.abs(s1-s2);
            pointer1=headA;
            pointer2=headB;
            if (s1>s2){
             int i=0;
             while (i<diff){
                pointer1=pointer1.next;
                i++;
             }
          }else{
                int i=0;
                while (i<diff){
                    pointer2=pointer2.next;
                    i++;
                }
            }
            while (pointer1!=null||pointer2!=null){
                if (pointer1.val== pointer2.val) return pointer1;
                else {
                    pointer1=pointer1.next;
                    pointer2=pointer2.next;
                }
            }
            return  null;
        }
}
