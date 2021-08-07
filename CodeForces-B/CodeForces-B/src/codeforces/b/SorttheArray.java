package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class SorttheArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr=new int[n];
        int[] arr1=new int[n];
        for (int i = 0; i < n; i++) {
          arr[i]=Integer.parseInt(st.nextToken());
          arr1[i]=arr[i];
        }
        int begin=-1,end=-1;
        Arrays.sort(arr1);
        for (int i = 0; i < n; i++) {
            if(arr[i]!=arr1[i]){
                begin=i;
                break;
            }
        }
        for (int i = n-1; i >=0; i--) {
            if (arr[i]!=arr1[i]){
                end=i;
                break;
            }
        }
        if(begin==-1) {
            System.out.println("yes");
            System.out.println(1+" "+1);
            return;
        }
        Stack<Integer> temp=new Stack<>();
        for (int i = begin; i <=end ; i++) {
            temp.add(arr[i]);
        }
        for (int i = begin; i <=end ; i++) {
            arr[i]=temp.pop();
        }
        for (int i = begin; i <=end ; i++) {
            if(arr[i]!=arr1[i]) {
                System.out.println("no");
                return;
            }
        }
       System.out.println("yes");
        begin++;end++;
       System.out.println(begin+" "+end);
    }
}
