class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char sc:t.toCharArray()) map.put(sc,map.getOrDefault(sc,0)+1);
        int l=0;
        int matched=0;
        int begin=0;
        int minWindow=Integer.MAX_VALUE;
        for(int r=0;r<s.length();r++){
            char cr=s.charAt(r);
            if(map.containsKey(cr)) {
                map.put(cr,map.get(cr)-1);
                if(map.get(cr)==0)matched++;
            }
            while(matched==map.size()){
                if(minWindow>r-l+1){
                    minWindow=r-l+1;
                    begin=l;
                }
                char cl=s.charAt(l++);
                if(map.containsKey(cl)) {
                    if(map.get(cl)==0) matched--;
                    map.put(cl,map.get(cl)+1);
                }
            }
        }
        return minWindow==Integer.MAX_VALUE ? "": s.substring(begin,begin+minWindow);
    }
}