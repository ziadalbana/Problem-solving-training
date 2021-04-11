/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm.traing;

import java.util.Arrays;
import java.util.Scanner;


public class HamadaAndTheValentine {

   
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       long[] num=new long[n];
       int i;
       int count=0;
       for(i=0;i<n;i++){
           num[i]=in.nextLong();
       }
       int countn=0;
       Arrays.sort(num);
       boolean[] visited=new boolean[n];
       i=0;
       int j=i+1;
       while(i<n){ 
           while(j<n){
           if(!visited[j]&&num[i]<num[j]){
               visited[j]=true; 
               i++;
               j=i+1;
           }else{
               j++;
           }
           }
           i++;
       }
       for(i=0;i<num.length;i++){
           if(!visited[i]){
               count++;
           }
          
     }      
       System.out.println(count);
       
    
    }
}
