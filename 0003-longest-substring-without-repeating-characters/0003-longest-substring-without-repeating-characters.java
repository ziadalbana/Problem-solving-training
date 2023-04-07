class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashMap<Character,Integer> map=new HashMap<>();
        int longestSeq=0;
        int l=0,r=0;
        while(r<s.length()){
            char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)>1){
                while(map.get(c)>1){
                    char lc=s.charAt(l);
                    map.put(lc,map.get(lc)-1);
                    l++;
                }
            }
            longestSeq=Integer.max(r-l+1,longestSeq);
            r++;
        }
        return longestSeq;
    }
}