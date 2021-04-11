
package javaapplication22;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Arpashardexam {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] num=new int[]{8,4,2,6};
       if(n==0){
           System.out.println(0);
       }else if(n>0){
           n=(n-1)%4;
           System.out.println(num[n]);
       }
    }
    
}
