class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "");
        s=s.toLowerCase();
        int l=0,r=s.length()-1;
        char[] arr=s.toCharArray();
        while(l<r){
            if(arr[l++]!=arr[r--]) return false;
        }
        return true;
    }
}