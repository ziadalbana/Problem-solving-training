/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class fuelfill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       ArrayList<Integer> fuel=new ArrayList();
       int n=in.nextInt();
       int distance=in.nextInt();
       int i;
       int count=0;
       int difference=distance;
       for(i=0;i<n;i++){
          fuel.add(in.nextInt());
       }
       for(i=0;i<n-1;i++){
           difference-=(fuel.get(i+1)-fuel.get(i));
           if(difference<fuel.get(i+1)-fuel.get(i)){
               count++;
               difference=distance;
           }
       }
       System.out.println(count);
       
    }
    
}
