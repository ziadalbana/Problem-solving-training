/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class TheatreSquare {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      long n=in.nextLong();
      long m=in.nextLong();
      long a=in.nextLong();
      long width,length;
      long result=0;
       width=n/a;
      length=m/a;
     
      if(width*a<n){
          width++;
      }
      if(length*a<m){
          length++;
      }
      result=length*width;
      System.out.println(result);
    }
    
}
