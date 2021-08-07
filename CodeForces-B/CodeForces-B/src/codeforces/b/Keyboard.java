package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Keyboard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int [] arr=new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for (int i = 0; i < n-2; i++) {
            int a=arr[i];
            int b=arr[i+1];
            int c=arr[i+2];
            /*
            a + b > c
            a + c > b
            b + c > a
            */
            if (a+b<=c) continue;
            if(b+c<=a) continue;
            if (a+c<=b) continue;
            else {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
