package codeforces.b;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BurglarandMatches {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        int m=in.nextInt();
        int [][] arr=new int[m][2];
        for (int i = 0; i < m; i++) {
           arr[i][0]=in.nextInt();
           arr[i][1]=in.nextInt();
        }
        Arrays.sort(arr, Comparator.comparingInt(o -> o[1]));
        int count=0;
        for(int i=m-1;i>=0;i--){
            if(n-arr[i][0]>0){
                n-=arr[i][0];
                count+=arr[i][0]*arr[i][1];
            }
            else{
                count+=n*arr[i][1];
                break;
            }
        }
        System.out.println(count);
    }
}
