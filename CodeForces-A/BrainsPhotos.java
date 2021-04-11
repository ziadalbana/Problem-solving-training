/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Scanner;


public class BrainsPhotos {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        char[][] image=new char[n][m];
        int i,j;
        String result="#Black&White";
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                image[i][j]=in.next().charAt(0);
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(image[i][j]!='W'&&image[i][j]!='B'&&image[i][j]!='G'){
                   result="#Color";
                   break;
                }
            }
        }
        System.out.println(result);
    }
    
}
