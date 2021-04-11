/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.Scanner;


public class Alyonaandmex {

    
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int cases=in.nextInt();
      int[] num=new int[cases*2];
      int[] result=new int[n+1];
      int i,j=0; 
      int difference=0;
      int count = 0;
      int min=-1;
      for(i=0;i<2*cases-1;i+=2){
          num[i]=in.nextInt();
          num[i+1]=in.nextInt();
          difference=num[i+1]-num[i]+1;
          if(i==0||min>difference){
              min=difference;
              count=i;
          }
      }
      for(i=1;i<n+1;i++){
          if(j==min){
              j=0;
          }
          result[i]=j;
          j++;
      }
      System.out.println(min);
      for(i=1;i<n+1;i++){
          System.out.print(result[i]+" ");
      }
    }
    
}
