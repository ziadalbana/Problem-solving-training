/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traing;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class IWannaBetheGuy {

    
    public static void main(String[] args) {
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int i;
      ArrayList<Integer> level=new ArrayList<>();
      int p1=in.nextInt();
      int[] player1=new int[p1];
      for(i=0;i<p1;i++){
          player1[i]=in.nextInt();
      }
      int p2=in.nextInt();
       int[] player2=new int[p2];
       for(i=0;i<p2;i++){
          player2[i]=in.nextInt();
      }
        for(i=0;i<p1;i++){
          if(!level.contains(player1[i])){
              level.add(player1[i]);
          }
      }
      for(i=0;i<p2;i++){
          if(!level.contains(player2[i])){
              level.add(player2[i]);
          }
      }  
    
      if(level.size()==n){
          System.out.println("I become the guy.");
      }else{
          System.out.println("Oh, my keyboard!");
      }
      
    }
    
}
