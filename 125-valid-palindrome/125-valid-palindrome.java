class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
               if(Character.isUpperCase(c)) res.append(Character.toLowerCase(c));
               else res.append(c); 
            }
        }
        int size=res.length();
        for(int i=0;i<size/2;i++){
            if(res.charAt(i)!=res.charAt(size-i-1)) return false;
        }
        return true;
    }
}