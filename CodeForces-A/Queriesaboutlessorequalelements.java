/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Queriesaboutlessorequalelements {

    
    public static void main(String[] args) throws IOException {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
       StringTokenizer s = new StringTokenizer(in.readLine());
       int n=Integer.parseInt(s.nextToken());
       int m=Integer.parseInt(s.nextToken());
       int[] arr1=new int[n];
       int[] arr2=new int[m];
       int i,j,x=0;
       int current;
       s=new StringTokenizer(in.readLine());
       for(i=0;i<n;i++){
           arr1[i]=Integer.parseInt(s.nextToken());
       }
        Arrays.sort(arr1);
       s=new StringTokenizer(in.readLine());
       for(i=0;i<m;i++){
            current=Integer.parseInt(s.nextToken());
           x=binarySearch(arr1,current);
          System.out.print(x+" ");
       }
     
    }
    public static int binarySearch(int[] arr,int num){
        int start=0;
        int end=arr.length;
        while (start < end) {
            int mid=(start+end)/2; 
            if (arr[mid] <=num) {
               start=mid+1;
            }else if(arr[mid]>num){
                end=mid;
            }else if(arr[mid-1]<num&&arr[mid]>num) {
                start=mid;
            }
        }
        return start;
    }
  
}
