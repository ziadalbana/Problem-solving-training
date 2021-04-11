/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Scanner;


public class SnowFootprints {

    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       String road=in.next();
       int i;
       int count = 0;
       int right = 0,left = 0;
       for(i=0;i<road.length()-1;i++){
           if(road.charAt(i)=='R'||road.charAt(i+1)=='L'){
              left=i;
           } if(road.charAt(i)!='.'){
               right++;
           }
           
       }
       right--;
       System.out.println(right+" "+left);
      
        
    }
    
}
