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
public class AntonDanik {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int cases=0;
      int antion=0;
      int danik=0;
      String word;
      cases=input.nextInt();
      word=input.next();
      for(int i=0;i<cases;i++){
          if(word.charAt(i)=='A'){
              antion+=1;
          }else if(word.charAt(i)=='D'){
              danik+=1;
          }
      }
      if(antion>danik){
          System.out.println("Anton");
      }else if(antion<danik){
          System.out.println("Danik");
      }else {
          System.out.println("Friendship");
      }
        
    }
    
}
