package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Decoding {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int wordSize=Integer.parseInt(st.nextToken());
        st =new StringTokenizer(br.readLine());
        String word= st.nextToken();
        char[] result=new char[wordSize];
        int temp=wordSize/2;
        int i=1,y=0;
        int size=wordSize;
        for (int j = 0; j < size; j++) {
            int target;
            if(wordSize%2==0) {
                target=temp-i;
                i++;
            }
            else {
                target = temp + y;
                y++;
            }
            result[target]=word.charAt(j);
            wordSize--;
        }
        String ans=new String(result);
        System.out.println(ans);
    }
}
