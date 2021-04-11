
package javaapplication22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;


public class YaroslavandPermutations {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i,j;
        int freq=0;
        boolean[] visited = new boolean[n];
        ArrayList<Integer> num=new ArrayList<>();
        for(i=0;i<n;i++){
            num.add(in.nextInt());
        }
        for(i=0;i<n;i++){
          for(j=i;j<n;j++){
              if(!visited[j]&&Objects.equals(num.get(i), num.get(j))){
                  freq++;
                  visited[j]=true;
              }
          }
          if(n%2==0){
          if(freq> n/2){
              System.out.println("NO");
              return;
          }
          }else{
              if(freq>(n/2)+1){
               System.out.println("NO");
              return;
              }
          }
          
          freq=0;
           
        }
        System.out.println("YES");
        
    }
    
}
