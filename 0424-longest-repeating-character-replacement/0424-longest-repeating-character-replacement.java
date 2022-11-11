class Solution {
    public int characterReplacement(String s, int k) {
    // TODO: Write your code here
    int windowStart=0;
    int maxLength=0,maxRepeating=0;
    HashMap<Character,Integer> map=new HashMap<>();
    for(int windowEnd=0;windowEnd<s.length();windowEnd++){
         char c=s.charAt(windowEnd);
         map.put(c,map.getOrDefault(c,0)+1);
         maxRepeating=Integer.max(maxRepeating,map.get(c));
         if(windowEnd-windowStart-maxRepeating+1>k){
           char leftChar=s.charAt(windowStart++);
           map.put(leftChar,map.get(leftChar)-1);
         }
         maxLength=Integer.max(maxLength,windowEnd-windowStart+1);
    }
    return maxLength;
  }
}