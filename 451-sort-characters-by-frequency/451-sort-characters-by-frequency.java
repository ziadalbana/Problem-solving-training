class Solution {
    public String frequencySort(String s) {
    // TODO: Write your code here
    HashMap<Character,Integer> freqMap=new HashMap<>();
    for(char c:s.toCharArray()) freqMap.put(c,freqMap.getOrDefault(c,0)+1);
    PriorityQueue<Map.Entry<Character,Integer>> maxHeap=new PriorityQueue<>((a1,a2)->a2.getValue()-a1.getValue());
    for(Map.Entry<Character,Integer> entry:freqMap.entrySet()) maxHeap.add(entry);
    String res="";
    while(!maxHeap.isEmpty()){
      Map.Entry<Character,Integer> entry =maxHeap.poll();
      for(int i=0;i<entry.getValue();i++) res+=entry.getKey();
    }
    return res;
    }
}