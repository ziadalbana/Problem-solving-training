class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<10) return new ArrayList<>();
        int windowStart=0;
        HashMap<String,Integer> map=new HashMap<>();
        for(int windowEnd=9;windowEnd<s.length();windowEnd++){ 
           String word=s.substring(windowStart++,windowEnd+1);
           map.put(word,map.getOrDefault(word,0)+1);
        } 
       List<String> result=new ArrayList<>();
       for(Map.Entry<String,Integer> entry:map.entrySet())
           if(entry.getValue()>1) result.add(entry.getKey());
       return result; 
    }
}
