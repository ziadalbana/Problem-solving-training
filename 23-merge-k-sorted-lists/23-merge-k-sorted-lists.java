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
    public ListNode mergeKLists(ListNode[] lists) {
    ListNode result = new ListNode(-1);
    ListNode pointer=result;
    PriorityQueue<ListNode> minHeap=new PriorityQueue<>((a1,a2)->a1.val-a2.val);
    for(int i=0;i<lists.length;i++)
        if(lists[i]!=null) minHeap.add(lists[i]);
    while(!minHeap.isEmpty()){
     ListNode min=minHeap.poll();
     result.next=min;
     result=result.next;
     if(min.next!=null) minHeap.add(min.next);
    }
    return pointer.next;
    }
}