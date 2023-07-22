class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1=0,p2=0;
        int turn=0;
        StringBuilder s=new StringBuilder();
        while(p1<word1.length()&&p2<word2.length()){
            if(turn%2==0) s.append(word1.charAt(p1++));
            else s.append(word2.charAt(p2++));
            turn++;
        }
        while(p1<word1.length()) s.append(word1.charAt(p1++));
        while(p2<word2.length()) s.append(word2.charAt(p2++));
        return s.toString();
    }
}