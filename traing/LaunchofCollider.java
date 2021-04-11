
package javaapplication22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class LaunchofCollider {

   
    public static void main(String[] args) throws IOException {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer s = new StringTokenizer(in.readLine());
       int n=Integer.parseInt(s.nextToken());
       s = new StringTokenizer(in.readLine());
       String order=s.nextToken();
       s = new StringTokenizer(in.readLine());
       int i,j,x;
       ArrayList<Integer> moves=new ArrayList<>();
       for(i=0;i<n;i++){
           moves.add(Integer.parseInt(s.nextToken()));
       }
        x=Integer.MAX_VALUE;
           for(j=0;j<n-1;j++){
               if(order.charAt(j)=='R'&&order.charAt(j+1)=='L'){
                   x=Integer.min(x,(moves.get(j+1)-moves.get(j))/2);
                   i=-1;
               }
           }               
           if(i!=-1){
               System.out.println(-1);
           }else{
               System.out.println(x);
           }
          
    }
    
}
