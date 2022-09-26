class Solution {
    public int kthSmallest(int[][] lists, int k) {
    int m=lists[0].length;
    PriorityQueue<node> minHeap=new  PriorityQueue<>((a1,a2)->a1.val-a2.val);
    for(int i=0;i<lists.length;i++) minHeap.add(new node (lists[i][0],i,0));
    int count=0;
    while(count<k){
      node min=minHeap.poll();
      count++;
      if(count==k) return min.val;
      if(min.index<m-1) minHeap.add(new node(lists[min.rowIdx][min.index+1],min.rowIdx,min.index+1));
    }
    return -1;
    }
 class node {
    int val;
    int index;
    int rowIdx;
    public node (int val,int rowIdx,int index){
        this.val=val;
        this.rowIdx=rowIdx;
        this.index=index;
    }
  }
}