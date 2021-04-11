/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traing;

import java.util.Scanner;


public class Presents {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=0;
        int n=in.nextInt();
        int[] arr=new int[n];
        int[] result=new int[n];
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(i=0;i<n;i++){
            result[arr[i]-1]=i+1;
        }
        for(i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
    }
    
}
