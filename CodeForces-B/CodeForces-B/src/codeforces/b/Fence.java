package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Fence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int width=Integer.parseInt(st.nextToken());
        int[] arr=new int[n+1];
        arr[0]=0;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n ; i++) {
            arr[i]=arr[i-1]+Integer.parseInt(st.nextToken());
        }
        int minHeight=Integer.MAX_VALUE;
        int index=0;
        for (int i = 0; i < n-width+1 ; i++) {
            int temp=arr[i+width]-arr[i];
            if(minHeight>temp) {
                minHeight=temp;
                index=i+1;
            }
        }
        System.out.println(index);
    }
}
