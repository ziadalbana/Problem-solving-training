class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] map1=new int[256];
        Arrays.fill(map1,-1);
        int[] map2=new int[256];
        Arrays.fill(map2,-1);
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            char l1=s.charAt(i);
            char l2=t.charAt(i);
            if(map1[l1]==-1&&map2[l2]==-1){
                map1[l1]=l2;
                map2[l2]=l1;
            }else if(!(map1[l1]==l2&&map2[l2]==l1)){
                return false;
            }
        }
        return true;
    }
}