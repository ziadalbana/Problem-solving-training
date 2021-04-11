/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm.traing;

import java.util.Scanner;


public class HamadaTheSenpai {

    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String n1=in.next();
       String n2=in.next();
       String small;
       String big;
       int sum;
       int carry=0;
       int i,j,x=0,y=0;
       int count=0;
       if(n1.length()>=n2.length()){
           big=n1;
           small=n2;
           
       }else{
           big=n2;
           small=n1;
       }
       j=big.length()-1; 
       i=small.length()-1;       
       while(i>=0||j>=0){
           x=0;y=0;
           if(i>=0){
               x=small.charAt(i)-48;
           } 
           if(j>=0){
               y=big.charAt(j)-48;
           }
           sum=x+y+carry;
           carry=0;
           j--;
           i--;
           if(sum>9){
               count++;
               carry=1;
           }
       }
       System.out.println(count);
    }
    
}
