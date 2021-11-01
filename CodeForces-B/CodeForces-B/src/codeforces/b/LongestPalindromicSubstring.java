package codeforces.b;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int size=s.length();
        boolean [] check=new boolean[size];
        if(size%2!=0) check[size/2 +1]=true;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i)==s.charAt(size-1-i)) check[i]=true;
        } 
        String result = null;
        result+="";
        for (int i = 0; i < size; i++) {

        }

    }
}
