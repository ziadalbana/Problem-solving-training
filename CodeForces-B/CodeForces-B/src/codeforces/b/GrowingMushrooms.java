package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class GrowingMushrooms {
    public static void main(String[] args) throws IOException {
        // wrong answer
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int t1=Integer.parseInt(st.nextToken());
        int t2=Integer.parseInt(st.nextToken());
        double percent=Double.parseDouble(st.nextToken())/100.00;
        double[][] arr=new double[n][2];
        boolean[] inserted=new boolean[n];
        for (int i = 0; i <n; i++) {
            st = new StringTokenizer(br.readLine());
            int v1=Integer.parseInt(st.nextToken());
            int v2=Integer.parseInt(st.nextToken());
            double temp1=v1*t1-(v1*t1*percent)+v2*t2;
            double temp2=v2*t1-(v2*t1*percent)+v1*t2;
            if (temp1>temp2){
                arr[i][0]=i+1;
                arr[i][1]=temp1;
            }else{
                arr[i][0]=i+1;
                arr[i][1]=temp2;
            }
        }
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));
        for (int i = n-1; i >=0; i--) {
                System.out.printf("%.0f %.2f \n",arr[i][0],arr[i][1]);
        }
    }
}
