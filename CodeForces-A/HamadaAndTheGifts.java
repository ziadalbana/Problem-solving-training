/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm.traing;

import java.util.Scanner;

public class HamadaAndTheGifts {

    
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int[] gifts=new int[n+1];
      int i;
      for( i=1;i<=n;i++){
          gifts[i]=in.nextInt();
      }
      boolean[] visited=new boolean[n+1];
      int count=n;
      for(i=1;i<=n;i++){
          visited[gifts[i]]=true;
          if(count>0&&visited[count]){
          while(count>0&&visited[count]){
              System.out.print(count--+" ");
          }
          System.out.println("");
          }else{
          System.out.println("We are waiting Hamada!");
      }
      }     
    }
    
}
