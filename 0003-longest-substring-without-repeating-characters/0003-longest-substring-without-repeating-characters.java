class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashSet<Character> set=new HashSet<>();
        int windowStart=0;
        int maxLength=Integer.MIN_VALUE;
        for(int windowEnd=0;windowEnd<s.length();windowEnd++){
            char c=s.charAt(windowEnd);
            while(set.contains(c)) set.remove(s.charAt(windowStart++));
            maxLength=Integer.max(maxLength,windowEnd-windowStart+1);
            set.add(c);
        }
        return maxLength;
    }
}