/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm.traing;

import java.awt.Point;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class HamadaAndHisCrush {

    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       Stack n1=new Stack();
       Queue<Integer> n2 = new LinkedList<>(); 
       ArrayList<Point> operation = new ArrayList<Point>();
        PriorityQueue<Integer> minPriority = new PriorityQueue<>();
        PriorityQueue<Integer> maxPriority = new PriorityQueue<>((l,m) -> Integer.compare(m,l)); 
       int i;
       int x,y;
       int count=0;
       int stack=0;
       int queue=0;
       int minQueue=0;
       int maxQueue=0;
       int count2=0;
       for(i=0;i<n;i++){
           x=in.nextInt();
           y=in.nextInt();
           
           if(x==2){
              if(count2==queue&&n2.peek()==y){
                  queue++;
                  n2.poll();
              }
               if(count2==stack&&(int)n1.peek()==y){
                  n1.pop();
                  stack++;
              }
              if(count2==minQueue&&minPriority.peek()==y){
                minPriority.poll();
                minQueue++;
              }if(count2==maxQueue&&maxPriority.peek()==y){
                 maxPriority.poll();
                maxQueue++; 
              }
              count2++;
           }else{
           n1.add(y);
           n2.add(y);
           minPriority.add(y);
           maxPriority.add(y);
          
           }
       }
       if(stack!=count2&&queue==count2&&minQueue!=count2&&maxQueue!=count2){
           System.out.println("Queue !");
       }else if(stack==count2&&queue!=count2&&minQueue!=count2&&maxQueue!=count2){
           System.out.println("Stack !");
       }else if(stack!=count2&&queue!=count2&&(minQueue==count2||maxQueue==count2)){
           System.out.println("Priority queue !");
       }else if(stack==count2||queue==count2||(minQueue==count2||maxQueue==count2)){
           System.out.println("I'm not sure !");
       }
       else{
           System.out.println("Not a Data Structure !");
       }
       
       
    }
   
}
