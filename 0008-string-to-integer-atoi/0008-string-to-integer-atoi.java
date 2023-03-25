class Solution {
    public int myAtoi(String s) {
        int start=0;
        int sign=1;
        while(start<s.length()&&s.charAt(start)==' ') start++;
        if(start==s.length()) return 0;
        if(s.charAt(start)=='+'){
            sign=1;
            start++;
        }else if(s.charAt(start)=='-'){
            sign=-1;
            start++;
        }
        int res=0;
        while(start<s.length()){
            int n=s.charAt(start)-'0';
            if(n<0 || n>9) break;
            if(res>Integer.MAX_VALUE/10||res==Integer.MAX_VALUE/10&&Integer.MAX_VALUE%10<n){
                return sign==1 ? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res=(res*10)+n;
            start++;
        }
        return res*sign;
        
    }
}