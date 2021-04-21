
package codeforces.b;

import java.util.Scanner;


public class BearandFindingCriminals {

   
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int numCites=in.nextInt();
      int postion=in.nextInt(); 
      int[] arr=new int[numCites];
      for(int i=0;i<numCites;i++){
          arr[i]=in.nextInt();
      }
      int count=0;
      boolean flag = false;
      if(arr[postion-1]==1){
          count++;
      }
       int i=postion-2,y=postion;
      while(i>=0||y<numCites){
          if(i<0&&arr[y]==1){
              count++;
          }
          if(y>=numCites&&arr[i]==1){
              count++;
          }
          if(i>=0&&y<numCites){
            if(arr[i]==1&&arr[y]==1){
             count+=2;
            }
          }
           i--;
           y++;
      }
      System.out.println(count);
    }
    
}
