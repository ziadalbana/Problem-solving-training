class Solution {
     public int longestPalindrome(String s) {
        int count=0;
        int odd=0; 
        int[] map=new int[128];
        for(char c:s.toCharArray()) map[c]++;
        for(int n: map){
            if(n%2==0) count+=n;
            else  {
                odd=1;
                count+=(n-1);
            }
        }
        return count+odd;
    }
}