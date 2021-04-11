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
public class BlackSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[4];
        String moves;
        int sum=0;
        int i=0;
        for(i=0;i<4;i++){
            arr[i]=in.nextInt();
        }
        moves=in.next();
        for(i=0;i<moves.length();i++){
           sum+=arr[moves.charAt(i)-49]; 
        }
        System.out.println(sum);
    }
    
}
