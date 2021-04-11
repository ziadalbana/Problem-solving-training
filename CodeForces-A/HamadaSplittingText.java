/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm.traing;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class HamadaSplittingText {

    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String word=in.next();
       Queue n1 = new LinkedList<>(); 
       Queue n2=new LinkedList<>(); 
       int k=in.nextInt();
       int a=in.nextInt();
       int x=0,y=0;
       x=word.length()/k;
       y=word.length()/a;
       int z;
       int c1=1;
       int sum1=0;
       int i;
       if(x*k==word.length()){
           System.out.println("YES");
           System.out.println(x);
           for(i=0;i<x*k;i+=k){
               System.out.println(word.substring(i,i+k));
           }
       }else if(y*a==word.length()){
           System.out.println("YES");
           System.out.println(y);
           for(i=0;i<y*a;i+=a){
               System.out.println(word.substring(i,i+a));
           }
       }else {
           if(k>a){
               while(sum1<word.length()){
                   if(c1!=0&&sum1+k<word.length()){
                       sum1+=k;
                       c1=word.length()-sum1;
                       c1%=a;
                       n1.add(k);
                   }else{
                       sum1+=a;
                       n1.add(a);
                   }
               }
           }else if(a>k){
                while(sum1<word.length()){
                   if(c1!=0&&sum1+a<word.length()){
                       sum1+=a;
                       c1=word.length()-sum1;
                       c1%=k;
                       n1.add(a);
                   }else{
                       sum1+=k;
                       n1.add(k);
                   }
               }
           }
           if(sum1==word.length()){
           System.out.println("Yes");
           System.out.println(n1.size());
           for(i=0;i<word.length();i+=z){
               z=(int)n1.peek();
               System.out.println(word.substring(i,i+(int)n1.poll()));
           }
           }else{
           System.out.println("No");
       }
       }       
       
    }
    
}
