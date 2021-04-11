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
public class AntonandPolyhedrons {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      String[] words=new String[n];
      int i;
      int result=0;
      for(i=0;i<n;i++){
          words[i]=in.next();
      }
      for(i=0;i<n;i++){
          if(null != words[i])switch (words[i]) {
              case "Tetrahedron":
                  result+=4;
                  break;
              case "Cube":
                  result+=6;
                  break;
              case "Octahedron":
                  result+=8;
                  break;
              case "Dodecahedron":
                  result+=12;
                  break;
              case "Icosahedron":
                  result+=20;
                  break;
              default:
                  break;
          }
      }
        System.out.println(result);
        
    }
    
}
