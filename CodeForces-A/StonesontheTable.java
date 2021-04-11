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
public class StonesontheTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = 0;
        int count=0;
        cases=in.nextInt();
        String word;
        word=in.next();
        for(int i=0;i<cases-1;i++){
            if(word.charAt(i)==word.charAt(i+1)){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
