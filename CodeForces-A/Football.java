/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Football {

    
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     String[] teams=new String[2];
     int i;
     int count1=1,count2=0;
     teams[0]=in.next();
     for(i=1;i<n;i++){
        String c=in.next();
         if(teams[0] == null ? c != null : !teams[0].equals(c)){
             teams[1]=c;
             count2++;
         }else{
             count1++;
         }
     }
     if(count1>count2){
         System.out.println(teams[0]);
     }else
          System.out.println(teams[1]);
     }
        
        
    }
    

