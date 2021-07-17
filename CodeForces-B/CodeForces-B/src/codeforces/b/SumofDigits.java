package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumofDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String s=st.nextToken().toString();
        int moves=0;
        if(s.length()==1){
            System.out.println(0);
            return;
        }
        else{
            int sum=11;
          while (sum>=10){
              sum=0;
              for (int i = 0; i <s.length() ; i++) {
                  sum+=(s.charAt(i)-'0');
              }
              s = String.valueOf(sum);
              moves++;
          }
          System.out.println(moves);
        }
            
    }
}
