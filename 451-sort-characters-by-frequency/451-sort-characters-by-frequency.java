class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[256];
        for(char c:s.toCharArray()) freq[c]++;
        List<int[]> map=new ArrayList<>();
        for(int i=0;i<256;i++) if(freq[i]!=0) map.add(new int[]{i,freq[i]});
        Collections.sort(map,(a,b)->b[1]-a[1]);
        StringBuilder res=new StringBuilder();
        for(int[] arr:map){
            for(int i=0;i<arr[1];i++) res.append((char)arr[0]);
        }
        return res.toString();
    }
    
    
    // public String frequencySort(String s) {
    // // TODO: Write your code here
    // HashMap<Character,Integer> freqMap=new HashMap<>();
    // for(char c:s.toCharArray()) freqMap.put(c,freqMap.getOrDefault(c,0)+1);
    // PriorityQueue<Map.Entry<Character,Integer>> maxHeap=new PriorityQueue<>((a1,a2)->a2.getValue()-a1.getValue());
    // for(Map.Entry<Character,Integer> entry:freqMap.entrySet()) maxHeap.add(entry);
    // StringBuilder res=new StringBuilder();
    // while(!maxHeap.isEmpty()){
    //   Map.Entry<Character,Integer> entry =maxHeap.poll();
    //   for(int i=0;i<entry.getValue();i++) res.append(entry.getKey());
    // }
    // return res.toString();
    // }
}