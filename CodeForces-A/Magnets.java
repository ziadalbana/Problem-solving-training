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
public class Magnets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int cases=0;
     int i;
     int result=1;
     cases=in.nextInt();
     int[] arr=new int[cases];
     for(i=0;i<cases;i++){
         arr[i]=in.nextInt();
     }
     for(i=0;i<cases-1;i++){
         if(arr[i]!=arr[i+1]){
             result+=1;
         }
     }
     System.out.println(result);
    }
    
}
