public class Solution {
    public  List<Integer> findAnagrams(String str, String pattern) {
    if(pattern.length()>str.length()) return new ArrayList<Integer>();
    List<Integer> resultIndices = new ArrayList<Integer>();
    // TODO: Write your code here
    HashMap<Character,Integer> map=new HashMap<>();
    for(char c:pattern.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
    int windowStart=0;
    int matched=0;
    for(int windowEnd=0;windowEnd<str.length();windowEnd++){
       char r=str.charAt(windowEnd);
       if(map.containsKey(r)){
         map.put(r,map.get(r)-1);
         if(map.get(r)==0) matched++;
       }
       if(matched==map.size()){
         resultIndices.add(windowStart);
       }
       if(windowEnd>=pattern.length()-1){
         char l=str.charAt(windowStart++);
         if(map.containsKey(l)){
            if(map.get(l)==0) matched--;
            map.put(l,map.get(l)+1);
         }
       }

    }


    return resultIndices;
  }
}