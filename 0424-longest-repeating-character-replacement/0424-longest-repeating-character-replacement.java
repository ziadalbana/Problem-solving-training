class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int windowStart=0,windowEnd=0,repeated=0,maxLength=0;
        for(windowEnd=0;windowEnd<s.length();windowEnd++){
            char c=s.charAt(windowEnd);
            map.put(c,map.getOrDefault(c,0)+1);
            repeated=Integer.max(map.get(c),repeated);
            if(windowEnd-windowStart+1-repeated>k){
                char l=s.charAt(windowStart++);
                map.put(l,map.get(l)-1);
            }
            maxLength=Integer.max(windowEnd-windowStart+1,maxLength);
        }
        return maxLength;
    }
}