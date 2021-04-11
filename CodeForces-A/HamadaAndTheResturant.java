/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm.traing;

import java.util.Scanner;


public class HamadaAndTheResturant {

   
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      long[] info=new long[3*n];
      int i;
      double distance;
      int postion=-1;
      double mindistance=-1;
      long minprice = -1;
      for(i=0;i<3*n;i++){
          info[i]=in.nextLong();
      }
      for(i=0;i<=3*n-3;i+=3){
          distance= Math.sqrt(Math.pow(info[i],2)+Math.pow(info[i+1], 2));
          if(postion==-1||(mindistance>distance)){
              mindistance=distance;
              postion=i;
              minprice=info[i+2];
          }else if(mindistance==distance&&minprice>info[i+2]){
               mindistance=distance;
              postion=i;
              minprice=info[i+2];
          }else if(mindistance==distance&&minprice==info[i+2]&&info[postion]>info[i]){
               mindistance=distance;
              postion=i;
              minprice=info[i+2];
          }else if(mindistance==distance&&minprice==info[i+2]&&info[postion]==info[i]&&info[postion+1]>info[i+1]){
               mindistance=distance;
              postion=i;
              minprice=info[i+2];
          }
      }
      System.out.println((postion/3)+1);
      
      
    }
    
}
