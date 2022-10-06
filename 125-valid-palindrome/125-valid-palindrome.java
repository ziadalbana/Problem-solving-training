class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        StringBuilder res=new StringBuilder();
        for(char c:s.toLowerCase().toCharArray()){
            if(Character.isLetterOrDigit(c)){
               res.append(c); 
            }
        }
        int size=res.length();
        for(int i=0;i<size/2;i++){
            if(res.charAt(i)!=res.charAt(size-i-1)) return false;
        }
        return true;
    }
}