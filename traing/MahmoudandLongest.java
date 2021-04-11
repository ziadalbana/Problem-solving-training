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
public class MahmoudandLongest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        
        if(s1.length()<s2.length()){
          System.out.println(s2.length());
        }else if(s1.length()>s2.length()){
          System.out.println(s1.length());
        }else{
           System.out.println("-1"); 
        }
      
    }
    
}
