import java.util.Hashtable;
class Solution {
 // public int lengthOfLongestSubstring(String s) {
 //    //     int maxCount=Integer.MIN_VALUE;
 //    //     int count=0;
 //    //     int start=0;
 //    //     Hashtable<Character,Integer> indexs=new Hashtable<>();
 //    //     if(s.length()==1) return 1;
 //    //     if(s.length()==0) return 0;
 //    //     for (int i = 0; i < s.length(); i++) {
 //    //         char ss=s.charAt(i);
 //    //         if(indexs.containsKey(ss)&&indexs.get(ss)>=start){
 //    //             maxCount=Integer.max(maxCount,count);
 //    //             count=i-(indexs.get(ss)+1);
 //    //             start=indexs.get(ss)+1;
 //    //             indexs.put(ss,i);
 //    //         }else{
 //    //             indexs.put(s.charAt(i),i);
 //    //         }
 //    //         count++;
 //    //     }
 //    //     maxCount=Integer.max(maxCount,count);
 //    //     return maxCount;
 //    // }
public int lengthOfLongestSubstring(String s) {
        // TODO: Write your code here
        if(s.length()==0) return 0;
        HashSet<Character> map=new HashSet<>();
        int windowStart=0;
        int windowEnd;
        int maxLength=-1;
        for(windowEnd=0;windowEnd<s.length();windowEnd++){
            char c=s.charAt(windowEnd);
            while(map.contains(c)) {
                char ss=s.charAt(windowStart);
                map.remove(ss);
                windowStart++;
            }
            maxLength=Integer.max(maxLength,windowEnd-windowStart+1);
            map.add(c);
        }
        return maxLength ;
    }
}