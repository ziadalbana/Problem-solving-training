/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traing;

import java.util.Scanner;


public class HelpfulMaths {

    
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       String equation=in.nextLine();
       int signnum=equation.length()/2+1;
       char[] num=new char[signnum];
       char[] arranged=new char[equation.length()];
       int count=0;
       int i=0;
       int j=0;
       for( i=0;i<equation.length();i++){
           if(equation.charAt(i)>=48&&equation.charAt(i)<=57){
               num[count]=equation.charAt(i);
               count++;
           }
       }
       for(i=0;i<signnum;i++){
           for(j=1+i;j<signnum;j++){
               if(num[i]>num[j]){
                   char temp=num[i];
                   num[i]=num[j];
                   num[j]=temp;
               }
           }
       }
       count=0;
       for(i=0;i<equation.length();i+=2){
           arranged[i]=num[count];
           if(i!=equation.length()-1){
           arranged[i+1]='+';
           }
           count++;
       }
       String result=new String(arranged);
       System.out.println(result);
        
    }
    
}
