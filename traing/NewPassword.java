/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traing;

import java.util.Scanner;


public class NewPassword {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      String s="";
      for(int i=0;i<n;i++){
          s+=(char)((int)'a'+(i%k));
      }
      System.out.println(s);
    }
    
}
