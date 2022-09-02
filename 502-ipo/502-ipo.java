class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
     int n=profits.length;
    PriorityQueue<Integer> minCaptialHeap=new PriorityQueue<>(n,(i1,i2)->capital[i1]-capital[i2]);
    PriorityQueue<Integer> maxProfitHeap=new  PriorityQueue<>(n,(i1,i2)->profits[i2]-profits[i1]);
    for(int i=0;i<n;i++) minCaptialHeap.offer(i);
    int available=w;
    for(int i=0;i<k;i++){
      while(!minCaptialHeap.isEmpty()&&capital[minCaptialHeap.peek()]<=available)
            maxProfitHeap.add(minCaptialHeap.poll());
      if(maxProfitHeap.isEmpty()) break;
      available+=profits[maxProfitHeap.poll()];      
    }
    return available;   
    }
}