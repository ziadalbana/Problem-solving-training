class Solution {
    public String minWindow(String s, String t) {
       if(t.length()>s.length()) return "";
       HashMap<Character,Integer> map=new HashMap<>();
        for(char c:t.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
       int matched=0;
       int start=0;
       int begin=0;
        int minWindow=Integer.MAX_VALUE;
       for(int end=0;end<s.length();end++){
           char c=s.charAt(end);
           if(map.containsKey(c)){
               map.put(c,map.get(c)-1);
               if(map.get(c)==0) matched++;
           }
           while(matched==map.size()){
               if(minWindow>end-start+1){
                   minWindow=end-start+1;
                   begin=start;
               }
               char lc=s.charAt(start++);
               if(map.containsKey(lc)){
                  if(map.get(lc)==0) matched--;
                 map.put(lc,map.get(lc)+1);
              }
           }
       }
        return minWindow==Integer.MAX_VALUE? "" :s.substring(begin,begin+minWindow);
    }
}