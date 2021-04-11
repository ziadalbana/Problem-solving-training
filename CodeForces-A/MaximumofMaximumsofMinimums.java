/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MaximumofMaximumsofMinimums {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int k=in.nextInt();
       int result = 0;
       int i;
        ArrayList<Integer> num=new ArrayList<>();
       
       for(i=0;i<n;i++){
           num.add(in.nextInt());
       }
       if(k==1){
           result=Collections.min(num);
       }else if(k==2){
           if(num.get(0)>num.get(num.size()-1)){
               result=num.get(0);
           }else {
               result=num.get(num.size()-1);
           }
       }else if(k>=3){
           result=Collections.max(num);
       }
       System.out.println(result);
    }
    
}
