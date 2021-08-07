package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Summer_sell_off {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int days=Integer.parseInt(st.nextToken());
        long[][] arr=new long[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Comparator.comparingLong(o -> o[1]));
        long[][] maxSold=new long[n][2];
        boolean[] taken=new boolean[n];
        for (int i =n-1; i >= 0; i--) {
            maxSold[i][0]=arr[i][0]*2;
            maxSold[i][1]=i;
        }
        Arrays.sort(maxSold, Comparator.comparingLong(o -> o[0]));
        long sum=0;
        int count=0;
        for (int i = n-1; i >=0 ; i--) {
            if (count < days) {
                sum += Math.min(arr[(int) maxSold[i][1]][1],maxSold[i][0]);
                taken[(int) maxSold[i][1]] = true;
                count++;
            }else break;
        }
        for (int i = 0; i < n; i++) {
            if (!taken[i]) sum+=Math.min(arr[i][0],arr[i][1]);
        }
        System.out.println(sum);
    }
}
