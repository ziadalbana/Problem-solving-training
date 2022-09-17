class Solution {
    public String reorganizeString(String str) {
    HashMap<Character,Integer> freq=new HashMap<>();
        PriorityQueue<Map.Entry<Character,Integer>> maxHeap=new PriorityQueue<>((a1,a2)->a2.getValue()-a1.getValue());
        for(char c:str.toCharArray()) freq.put(c,freq.getOrDefault(c,0)+1);
        for( Map.Entry<Character,Integer> entry:freq.entrySet()){
            if(str.length()-entry.getValue()<str.length()/2) return "";
            maxHeap.add(entry);
        }
        StringBuilder res=new StringBuilder(str.length());
        Map.Entry<Character,Integer> prev=null;
        while(!maxHeap.isEmpty()){
            Map.Entry<Character,Integer> curr=maxHeap.poll();
            res.append(curr.getKey());
            curr.setValue(curr.getValue()-1);
            if(prev!=null&&prev.getValue()>0) maxHeap.add(prev);
            prev=curr;
        }

        return res.toString();
    }
}