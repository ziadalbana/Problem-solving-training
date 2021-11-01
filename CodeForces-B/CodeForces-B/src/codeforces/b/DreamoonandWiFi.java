package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DreamoonandWiFi {
    //unsolved
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String to= st.nextToken();
        st = new StringTokenizer(br.readLine());
        String from=st.nextToken();
        int toPostion=0;
        for (int i = 0; i < to.length(); i++) {
            if(to.charAt(i)=='+') toPostion++;
            else toPostion--;
        }
        int unknown=0;
        int intialPostion=0;
        for (int i = 0; i < from.length(); i++) {
            if (from.charAt(i)=='+') intialPostion++;
            else if(from.charAt(i)=='-')intialPostion--;
            else unknown++;
        }
        if(unknown==0) {
            if(intialPostion==toPostion) System.out.println(1.000000000000);
            else System.out.println(0.000000000000);
            return;
        }
        int[] possible=new int[(int) Math.pow(2,unknown)];
        for (int i = 0; i < possible.length; i++) {
            possible[i]=unknown-i;
        }

    }
}
