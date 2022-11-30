class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp=x;
        int reversed=0;
        while(temp>0){
            int digit=temp%10;
            reversed=(reversed*10)+digit;
            temp/=10;
        }
        return (x==reversed) ? true:false;
    }
}