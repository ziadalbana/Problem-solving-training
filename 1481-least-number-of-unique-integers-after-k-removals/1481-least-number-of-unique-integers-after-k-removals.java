class Solution {
    public int findLeastNumOfUniqueInts(int[] nums, int k) {
    HashMap<Integer,Integer> freqMap=new HashMap<>();
    PriorityQueue<Map.Entry<Integer,Integer>> minHeap=new PriorityQueue<>((a1,a2)->a1.getValue()-a2.getValue());
    int count=0;
    for(int i=0;i<nums.length;i++) freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
    for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()) minHeap.add(entry);
    while(k>0&&!minHeap.isEmpty()){
      int diff=minHeap.peek().getValue();
      if(diff<=k) {
        k-=diff;
        minHeap.poll();
      }else k=0;
    }
    return minHeap.size();
    }
}