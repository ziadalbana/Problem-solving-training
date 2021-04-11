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
public class CarrotCakes {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int[] arr=new int[4];
       int i=0;
       for(i=0;i<4;i++){
           arr[i]=in.nextInt();
       }
       int count=arr[0]/arr[2];
       int time=arr[1]*count;
       int building=arr[3]/arr[1];
       count-=building;
       if(count==1){
           count=1;
       }else if(count%2==0){
           count/=2;
       }else{
           count=(count/2)+1;
       }
       int timeOven=arr[3]+count*arr[1];
       if(timeOven<time){
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }
    }
    
}
