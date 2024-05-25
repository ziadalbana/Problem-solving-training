class Solution {
    public List<String> topKFrequent(String[] words, int k) {
       PriorityQueue<Map.Entry<String,Integer>> maxHeap =new PriorityQueue<>((a1,a2)-> (a1.getValue()==a2.getValue()) ? a1.getKey().compareTo(a2.getKey()) :a2.getValue()-a1.getValue());
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:words) map.put(word,map.getOrDefault(word,0)+1);
        for(Map.Entry<String,Integer> entry:map.entrySet()) maxHeap.add(entry);
        ArrayList<String> res=new ArrayList<>();
        for(int i=0;i<k;i++) res.add(maxHeap.poll().getKey());
        return res;
        
    }
}