/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm.traing;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class HamadainMexico {

    
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int i=0;
     int countturnright=0;
     int countturnleft=0;
     int temp=0;
     int difference;
      Deque<Integer> deque = new LinkedList<Integer>(); 
     for(i=0;i<n;i++){
         deque.add(in.nextInt());
     }
     int size=deque.size();
     int n2=in.nextInt();
     int val;
     for(i=0;i<n2;i++){
        val=in.nextInt();
         switch (val) {
             case 1:
                 deque.addLast(in.nextInt());
                 size++;
                 break;
             case 2:
                 deque.addFirst(in.nextInt());
                 size++;
                 break;
             case 3:
                 deque.addFirst(deque.pollLast());
                 break;
             default:
                deque.addLast(deque.pollFirst());
                 break;
         }    
     }
     System.out.println(size);
     i=0;
    while(i<size){
        System.out.print(deque.poll()+" ");
        i++;
    }
    
    }
    
}
