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
public class GravityFlip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int col=0;
        int  numCubes;
        int i=0;
        int j=0;
        int x=0;
        col=in.nextInt();
        int[] result=new int[col];
        for(i=0;i<col;i++){
            result[i]=in.nextInt();
        }
        for(i=0;i<col;i++){
            for (j=1+i;j<col;j++){
            if(result[i]>result[j]){
              numCubes=result[i];
              result[i]=result[j];
              result[j]=numCubes;
            }
          }
        }
        for(i=0;i<col;i++){
            System.out.print(result[i]+" ");
        }
        
      
    }
    
}
