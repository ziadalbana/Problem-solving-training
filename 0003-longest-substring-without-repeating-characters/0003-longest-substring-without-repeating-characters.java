class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int start=0;
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>1){
                char lc=s.charAt(start++);
                map.put(lc,map.get(lc)-1);
            }
            longest=Integer.max(longest,end-start+1);
        }
        return longest;
    }
}