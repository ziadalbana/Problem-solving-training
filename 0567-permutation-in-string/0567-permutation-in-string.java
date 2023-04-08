class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int matched=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: s1.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
        int start=0;
        for(int end=0;end<s2.length();end++){
            char c=s2.charAt(end);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0) matched++;
            }
            if(matched==map.size()) return true;
            if(end>=s1.length()-1){
                char lc=s2.charAt(start++);
                if(!map.containsKey(lc)) continue;
                if(map.get(lc)==0) matched--;
                map.put(lc,map.get(lc)+1);
            }
        }
        return false;
    }
}