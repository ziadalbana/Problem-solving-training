package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class KuriyamaMiraisStones {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int[] arr=new int[n+1];
        long[] prefix=new long[n+1];
        long[] orderPrefix=new long[n+1];
        st = new StringTokenizer(br.readLine());
        prefix[0]=0;
        for (int i = 1; i <= n; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
            prefix[i]=prefix[i-1]+arr[i];
        }
        Arrays.sort(arr);
        for (int i = 1; i <=n; i++) {
            orderPrefix[i]=arr[i]+orderPrefix[i-1];
        }
        st = new StringTokenizer(br.readLine());
        int qNum=Integer.parseInt(st.nextToken());
        for (int i = 0; i < qNum; i++) {
            st = new StringTokenizer(br.readLine());
            int type=Integer.parseInt(st.nextToken());
            int l=Integer.parseInt(st.nextToken());
            int r=Integer.parseInt(st.nextToken());
            if(type==1) System.out.println(prefix[r]-prefix[l-1]);
            else System.out.println(orderPrefix[r]-orderPrefix[l-1]);
        }



    }
}
