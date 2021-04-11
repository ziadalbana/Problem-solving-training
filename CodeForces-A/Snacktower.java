/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;


public class Snacktower {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        ArrayList<Integer> size = new ArrayList<>();
        ArrayList<Integer> sorted = new ArrayList<>();
        Stack s1=new Stack();
        String result="";
        int i;
        int count=0;
        for(i=0;i<num;i++){
          size.add(in.nextInt());
        }
        sorted=(ArrayList<Integer>) size.clone();
         Collections.sort(sorted, Collections.reverseOrder());  
        for(i=0;i<num;i++){
            s1.push(size.get(i));
            if(Objects.equals(size.get(i), sorted.get(count))){
                count+=s1.size();
                while(!s1.empty()){
                    result+=s1.pop()+" ";
                }
                System.out.println(result);
                result="";
            }else{
                System.out.println();
            }
        }
        
        
    }
    
}
