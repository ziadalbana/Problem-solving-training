
package javaapplication22;

import java.util.Scanner;


public class PolothePenguinandSegments {

    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int k=in.nextInt();
       int covered=0,i;
       int rest=0;
       int steps = 0;
       for(i=0;i<n;i++){
           int start=in.nextInt();
           int end=in.nextInt();
           covered+=(end-start+1);
       }
       rest=covered%k;
       if(rest>0){
       steps=k-rest;
       }
       System.out.println(steps);
    }
    
}
