class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder word=new StringBuilder();
        for(char c:s.toLowerCase().toCharArray())
            if(Character.isLetterOrDigit(c))
                word.append(c);
        String res=word.toString();
        String reversed=word.reverse().toString();
        return res.equals(reversed);
    }
}