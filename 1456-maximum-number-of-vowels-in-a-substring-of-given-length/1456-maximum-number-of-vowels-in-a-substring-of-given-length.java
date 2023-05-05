class Solution {
    public int maxVowels(String s, int k) {
        int max=Integer.MIN_VALUE;
        int start=0;
        int count=0;
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') count++;
            if(end+1>=k){
                max=Integer.max(max,count);
                char cS=s.charAt(start++);
                if(cS=='a'||cS=='e'||cS=='i'||cS=='o'||cS=='u') count--;
            }
        }
        return max;
    }
}