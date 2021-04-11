/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm.traing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class HamadaandtheKeys {

    
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      int[] letters=new int[26];
      String[] names=new String[n];
      ArrayList<String> result=new ArrayList<>();
      int i,j;
      int sum=0;
      int size=0;
      for(i=0;i<26;i++){
          letters[i]=in.nextInt();
      }
      for(i=0;i<n;i++){
          names[i]=in.next();
      }
      for(i=0;i<n;i++){
          for(j=0;j<names[i].length();j++){
             sum+=(letters[names[i].charAt(j)-97]); 
          }
          if(sum>=k){
              result.add(names[i]);
              size++;
          }
          sum=0;
      }
      Collections.sort(result);
      for(i=0;i<size;i++){
          System.out.println(result.get(i));
      }
    }
    
}
