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
public class PanoramixsPrediction {

    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int m=in.nextInt();
       int nextprime = 0;
       int i;
        switch (n) {
            case 2:
                nextprime=3;
                break;
            case 3:
                nextprime=5;
                break;
            default:
                for(i=n+2;i<50;i+=2){
                    if(nextprime(i)){
                        nextprime=i;
                        break;
                    }
                }    break;
        }
       if(nextprime==m){
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }
    }
    public static boolean nextprime(int x){
        int j;
        boolean status=true;
        if(x%2==0){
            return false;
        }else{
             for(j=3;j<=Math.sqrt(x);j+=2){
                    if(x%j==0){
                     status=false;
                     break;   
                    }
                }
            
        }
        return status;
    }
    
}
