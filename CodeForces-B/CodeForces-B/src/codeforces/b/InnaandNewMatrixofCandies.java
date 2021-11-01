package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class InnaandNewMatrixofCandies {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        String[] arr=new String[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i]=st.nextToken();
        }
        TreeSet<Integer> index=new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int colCandy=0;
            int coldrawf=0;
            boolean checked=false;
            for (int j = 0; j < m; j++) {
                if(!checked&&arr[i].charAt(j)=='G'){
                    coldrawf=j;
                }
                else if (checked&&arr[i].charAt(j)=='G'){
                    System.out.println(-1);
                    return;
                }
                else if (arr[i].charAt(j)=='S'){
                    colCandy=j;
                    checked=true;
                }
            }
            index.add(colCandy-coldrawf);
        }
        System.out.println(index.size());

    }
}
