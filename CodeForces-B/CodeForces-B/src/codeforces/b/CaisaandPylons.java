package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CaisaandPylons {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int [] arr=new int[n+1];
        int power=0;
        int money=0;
        arr[0]=0;
        for (int i = 1; i <= n; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            int height=arr[i]-arr[i+1];
            power+=height;
            if(power<0){
                money-=power;
                power=0;
            }
        }
        System.out.println(money);
    }
}
