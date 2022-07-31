class Solution {
    public String minWindow(String str, String pattern) {
         HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<pattern.length();i++) map.put(pattern.charAt(i),map.getOrDefault(pattern.charAt(i),0)+1);
        int windowStart=0;
        int matched=0;
        int minLength=Integer.MAX_VALUE;
        int start=0;
        for(int windowEnd=0;windowEnd<str.length();windowEnd++){
            char r=str.charAt(windowEnd);
            if(map.containsKey(r)){
                map.put(r,map.get(r)-1);
                if(map.get(r)>=0) matched++;
            }
            while(matched==pattern.length()) {
              if(minLength>windowEnd-windowStart+1){
                 minLength=windowEnd-windowStart+1;
                 start=windowStart;
               }
               char l=str.charAt(windowStart++);
                if(map.containsKey(l)) {
                  if(map.get(l)==0) matched--;
                  map.put(l,map.get(l)+1);
                }
            }
          }
        return (minLength==Integer.MAX_VALUE)? "": str.substring(start,start+minLength);
    }
}