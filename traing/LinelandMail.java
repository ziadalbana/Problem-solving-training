/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traing;

import java.util.Scanner;


public class LinelandMail {

    
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         int[] arr=new int[n];
         int[] result=new int[n*2];
         int n1,n2=0;
         int count=0;
         int i=0;
         for(i=0;i<n;i++){
           arr[i]=in.nextInt();
         }
        for(i=0;i<n;i++){
            if(i==0){
                result[count]=Math.abs(arr[i]-arr[i+1]);
                result[count+1]=Math.abs(arr[i]-arr[n-1]);
            }else if(i==n-1){
                result[count]=Math.abs(arr[i]-arr[i-1]);
                result[count+1]=Math.abs(arr[i]-arr[0]);
            }else{
                n1=Math.abs(arr[i]-arr[i+1]);
                n2=Math.abs(arr[i]-arr[i-1]);
                if(n1<n2){
                  result[count]=n1;  
                }else{
                    result[count]=n2;
                }
                n1=Math.abs(arr[i]-arr[n-1]);
                n2=Math.abs(arr[i]-arr[0]);
                if(n1>n2){
                  result[count+1]=n1;  
                }else{
                    result[count+1]=n2;
                }
                
            } 
            count+=2;
        }
        for(i=1;i<=2*n;i++){
           System.out.print(result[i-1]+" ");
           if(i%2==0){
               System.out.println();
           }
        }
    }
    
}
