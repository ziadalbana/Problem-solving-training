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
public class ColorfulStones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String colors;
        String instruction;
        colors=in.next();
        instruction=in.next();
        int i=0,j=0;
        while(i<colors.length()&&j<instruction.length()){
            if(colors.charAt(i)==instruction.charAt(j)){
                i++;
            }
            j++;
        }
        System.out.println(++i);
    }
    
}
