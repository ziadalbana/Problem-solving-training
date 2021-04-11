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
public class Word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         String word;
         word=in.next();
         int lower=0;
         int upper=0;
         for(int i=0;i<word.length();i++){
             if(word.charAt(i)>=65&&word.charAt(i)<=90){
                 upper+=1;
             }else if(word.charAt(i)>=97&&word.charAt(i)<=122){
                 lower+=1;
             }
         }
         if(lower==upper){
             System.out.println(word.toLowerCase());
         }else if(lower>upper){
             System.out.println(word.toLowerCase());
         }else if(upper>lower){
              System.out.println(word.toUpperCase());
         }
    }
    
}
