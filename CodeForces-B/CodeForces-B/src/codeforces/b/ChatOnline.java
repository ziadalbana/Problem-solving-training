package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChatOnline {
    //unsolved
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p=Integer.parseInt(st.nextToken());
        int q=Integer.parseInt(st.nextToken());
        int l=Integer.parseInt(st.nextToken());
        int r=Integer.parseInt(st.nextToken());
        int[][] arr1=new int[p][2];
        int[][] arr2=new int[q][2];
        for (int i = 0; i <p ; i++) {
            st = new StringTokenizer(br.readLine());
            arr1[i][0]=Integer.parseInt(st.nextToken());
            arr1[i][1]=Integer.parseInt(st.nextToken());
        }
        int d1,d2;
        st = new StringTokenizer(br.readLine());
        d1=Integer.parseInt(st.nextToken());
        d2=Integer.parseInt(st.nextToken());
        arr2[0][0]=d1*2;
        arr2[0][1]=d2+d1;
        for (int i = 1; i <q ; i++) {
            st = new StringTokenizer(br.readLine());
            arr2[i][0]=Integer.parseInt(st.nextToken())+d1;
            arr2[i][1]=Integer.parseInt(st.nextToken())+d1;
        }
        int i=0,j=0,max=0;
        while (i< arr1.length&&j< arr2.length&&max<r){
            
        }


    }
}
