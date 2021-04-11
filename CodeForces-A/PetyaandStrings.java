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
public class PetyaandStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word1;
        String word2;
        Scanner in=new Scanner(System.in);
        word1=in.next().toLowerCase();
        word2=in.next().toLowerCase();
        if(word1.equals(word2)){
            System.out.println("0");
        }else if(word1.compareTo(word2)>0){
            System.out.println("1");
        }else if(word1.compareTo(word2)<0){
            System.out.println("-1");
        }
                
    }
    
}
