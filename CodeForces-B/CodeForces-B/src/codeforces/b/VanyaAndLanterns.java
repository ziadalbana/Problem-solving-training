package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class VanyaAndLanterns {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int l=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        double maxDiffin=0;
        double maxleft=arr[0];
        double maxright=l-arr[n-1];
        for (int i = 0; i < n-1; i++) {
            int temp=arr[i+1]-arr[i];
            if(maxDiffin<temp) maxDiffin=temp;
        }
        double max=maxDiffin/2.0000000000;
        double result=Math.max(maxleft,maxright);
        result=Math.max(result,max);
        System.out.println(result);
    }
}
