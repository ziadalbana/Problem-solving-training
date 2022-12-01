class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> idx=new ArrayList<>();
        if(s.length()<p.length()) return idx;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:p.toCharArray())map.put(c,map.getOrDefault(c,0)+1);
        int windowStart=0;
        int matched=0;
        for(int windowEnd=0;windowEnd<s.length();windowEnd++){
            char c=s.charAt(windowEnd);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0) matched++;
            }
            if(windowEnd>=p.length()-1){
                if(matched==map.size()) idx.add(windowStart);
                char j=s.charAt(windowStart++);
                if(map.containsKey(j)){
                    if(map.get(j)==0) matched--;
                    map.put(j,map.get(j)+1);
                }
            }
        }
        return idx;
    }
}