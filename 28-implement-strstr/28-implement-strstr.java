class Solution {
     public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        int l1=0,l2=0,index=0;
        while(l1<haystack.length()&&l2<needle.length()){
            if(haystack.charAt(l1++)==needle.charAt(l2)){
                l2++;
                index=l1;
            }
            else if (index!=0) {
                l1 = index - l2+1;
                l2 = 0;
                index=0;
            }
        }
        if(l2==needle.length()) return (index-l2);
        return -1;
    }
}