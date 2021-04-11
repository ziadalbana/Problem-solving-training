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
public class SerejaandDima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = 0;
        int counter=0;
        int i = 0,j=0;
        int s = 0,d=0;
        int temp;
        cases = in.nextInt();
        int[] arr = new int[cases];
        for (i = 0; i < cases; i++) {
            arr[i] = in.nextInt();
        }
        i=0;
        while(counter<cases){
            if(arr[i]>arr[cases-1-j]){
              temp=arr[i];
              i++;
            }else{
              temp=arr[cases-1-j];
              j++;
            }
            if(counter%2==0){
                s+=temp;
            }else{
                d+=temp;
            }
            counter++;
        }
        System.out.println(s+" "+d);

    }
    
}
