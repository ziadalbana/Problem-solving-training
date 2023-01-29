class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap=new PriorityQueue<>((a1,a2)->a2.getValue()-a1.getValue());
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] res=new int[k];
        for(int num:nums) map.put(num,map.getOrDefault(num,0)+1);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()) maxHeap.add(entry);
        for(int i=0;i<k;i++) res[i]=maxHeap.poll().getKey();
        return res;
    }
}