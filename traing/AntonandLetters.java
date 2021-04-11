/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class AntonandLetters {

    
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      String numbers=in.nextLine();
      int i=0;
      int count=0;
      List<Character> chars = new ArrayList<Character>();
      while(numbers.charAt(i)!='}'){
          if(numbers.charAt(i)>=97&&numbers.charAt(i)<=122){
              if(!chars.contains(numbers.charAt(i))){
                 count++; 
                 chars.add(numbers.charAt(i));
              }
              
          }
         i++;
         
      }
              
     
      System.out.println(count);
      
    }
    
}
