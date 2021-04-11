/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traing;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Juicer {

    
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int[] arr=new int[3];
         int i=0;
         int count=0;
         int d=0;
         for(i=0;i<3;i++){
             arr[i]=in.nextInt();
         }
         int[] size=new int[arr[0]];
         for(i=0;i<size.length;i++){
             size[i]=in.nextInt();
         }
         for(i=0;i<arr[0];i++){
            if(size[i]<=arr[1]){
              d+=size[i];  
            }
            if(d>arr[2]){
                count++;
                d=0;
            }
        }
        System.out.println(count);
    }
    
}
