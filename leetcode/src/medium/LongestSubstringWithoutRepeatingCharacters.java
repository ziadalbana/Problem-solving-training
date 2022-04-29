package medium;

import java.util.Hashtable;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
     LongestSubstringWithoutRepeatingCharacters m=new LongestSubstringWithoutRepeatingCharacters();
     System.out.println(m.lengthOfLongestSubstring( "pwwkew"));
    }
    public int lengthOfLongestSubstring(String s) {
        int maxCount=Integer.MIN_VALUE;
        int count=0;
        int start=0;
        Hashtable<Character,Integer> indexs=new Hashtable<>();
        if(s.length()==1) return 1;
        if(s.length()==0) return 0;
        for (int i = 0; i < s.length(); i++) {
            char ss=s.charAt(i);
            if(indexs.containsKey(ss)&&indexs.get(ss)>=start){
                maxCount=Integer.max(maxCount,count);
                count=i-(indexs.get(ss)+1);
                start=indexs.get(ss)+1;
                indexs.put(ss,i);
            }else{
                indexs.put(s.charAt(i),i);
            }
            count++;
        }
        maxCount=Integer.max(maxCount,count);
        return maxCount;
    }
}
