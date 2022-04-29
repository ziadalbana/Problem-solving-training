package easy;

public class ReverseString {
    public void reverseString(char[] s) {
      int size=s.length;
      int mid=(size/2)-1;
        for (int i =0; i <=mid ; i++) {
            char ss=s[i];
            s[i]=s[size-i-1];
            s[size-i-1]=ss;
        }
    }
}
