class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap=
              new PriorityQueue<>((a1,a2)->a2.getValue()-a1.getValue());
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums) map.put(n,map.getOrDefault(n,0)+1);
        for(Map.Entry<Integer,Integer> entity:map.entrySet()) maxHeap.add(entity);
        for(int i=0;i<k;i++) res[i]=maxHeap.poll().getKey();
        return res;
        
    }
}