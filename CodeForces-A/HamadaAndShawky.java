/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm.traing;

import java.util.Scanner;

public class HamadaAndShawky {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       long n=in.nextLong();
       int k=in.nextInt();
       long count=0;
       long temp;
       if(k==1){
           System.out.println(-1);
       }else{
           while(n>=k){
            temp=(n/k);   
            count+=temp; 
            n=n/k+n%k;
               
           }
           
           System.out.println(count);
       }
       
    }
    
}
