class Solution {
    public int characterReplacement(String s, int k) {
        int repeated=Integer.MIN_VALUE;
        int [] map=new int[26];
        int start=0;
        int longest=0;
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            repeated=Integer.max(++map[c-'A'],repeated);
            if(end-start-repeated+1>k){
                char lc=s.charAt(start++);
                --map[lc-'A'];
            }
            longest=Integer.max(longest,end-start+1);
        }
        return longest;
    }
}