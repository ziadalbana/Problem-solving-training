package codeforces.b;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbb");
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxCount=0;
        HashSet<Character> indexs=new HashSet<>();
        if(s.length()==1) return 1;
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i; j < s.length(); j++) {
                if (indexs.contains(s.charAt(j))){
                    break;
                }else{
                    indexs.add(s.charAt(j));
                }
            }
            maxCount=Integer.max(indexs.size(),maxCount);
            indexs=new HashSet<>();
        }
        return maxCount;
    }
}
