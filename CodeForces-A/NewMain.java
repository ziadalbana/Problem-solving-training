/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Scanner;


public class NewMain {

    
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
       String num=in.next();
       char[] temp=num.toCharArray();
       for(int i=0;i<temp.length;i++){
           if(i!=0||temp[i]!=57){
           if(temp[i]>=53){
               temp[i]=(char) ((57-temp[i])+48);
           }
           }
       }
       String result=new String(temp);
       System.out.println(result);
    
    }
    
}
