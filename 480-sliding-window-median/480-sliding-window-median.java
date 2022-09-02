class Solution {
    PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap=new PriorityQueue<>();
    public double[] medianSlidingWindow(int[] nums, int k) {
      double[] result = new double[nums.length - k + 1];
        int windowStart=0;
        int windowEnd;
        int count=0;
        for(windowEnd=0;windowEnd<nums.length;windowEnd++){
            addNum(nums[windowEnd]);
            if(windowEnd>=k-1) {
                result[count++]=findMedian();
                deleteNum(nums[windowStart++]);
            }
        }
        return result;
    }
    private  void addNum(int num){
        if(maxHeap.isEmpty()||maxHeap.peek()>=num) maxHeap.add(num);
        else minHeap.add(num);
        //update heaps
        balanceHeaps();
    }
    private  double findMedian(){
        if(minHeap.size()==maxHeap.size()) return (minHeap.peek()/2.0)+(maxHeap.peek()/2.0);
        return maxHeap.peek();
    }
    private  void deleteNum(int num){
        if(maxHeap.peek()>=num) maxHeap.remove(num);
        else minHeap.remove(num);
         balanceHeaps();
    }
     private void balanceHeaps(){
    if(maxHeap.size()>minHeap.size()+1) minHeap.add(maxHeap.poll());
    else if(maxHeap.size()<minHeap.size()) maxHeap.add(minHeap.poll());
  }
}