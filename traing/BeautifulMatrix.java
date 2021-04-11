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
public class BeautifulMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] max=new int[5][5];
        int col = 0;
        int row = 0;
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
               max[i][j]=in.nextInt();
            }
        }    
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(max[i][j]==1){
                    col=i+1;
                    row=j+1;
                    break;
                }
            }
        }
        int location;
        location=Math.abs(row-3)+Math.abs(col-3);
        System.out.println(location);
    }
    
}
