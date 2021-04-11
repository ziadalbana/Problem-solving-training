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
public class horseshoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
          int[] arr=new int[4];
          int i=0;
          int count=0;
          for(i=0;i<4;i++){
              arr[i]=in.nextInt();
          }
          for(i=0;i<4;i++){
              for(int j=1+i;j<4;j++){
                  if(arr[i]==arr[j]&&arr[i]>0){
                      count++;
                      arr[j]=-1;
                  }
              }
          }
          System.out.println(count);
    }
    
}
