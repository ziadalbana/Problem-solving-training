package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        String s;
        int [] sum=new int[3];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            s=st.nextToken();
            if(s.charAt(1)=='<'){
                if(s.charAt(2)=='A') sum[0]++;
                else if(s.charAt(2)=='B') sum[1]++;
                else sum[2]++;
            }else{
                if(s.charAt(0)=='A') sum[0]++;
                else if(s.charAt(0)=='B') sum[1]++;
                else sum[2]++;
            }
        }
        if(sum[0]==1&&sum[1]==1&&sum[2]==1){
            System.out.println("Impossible");
        }else{
            if (sum[0]==0) System.out.print("A");
            else if(sum[1]==0) System.out.print("B");
            else System.out.print("C");
            if (sum[0]==1) System.out.print("A");
            else if(sum[1]==1) System.out.print("B");
            else System.out.print("C");
            if (sum[0]==2) System.out.print("A");
            else if(sum[1]==2) System.out.print("B");
            else System.out.print("C");
        }
    }
}
