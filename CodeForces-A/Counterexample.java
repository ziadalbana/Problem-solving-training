package javaapplication22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Counterexample {

    
    public static void main(String[] args) throws IOException {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer s = new StringTokenizer(in.readLine());
       long start=Long.parseLong(s.nextToken());
       long end=Long.parseLong(s.nextToken());
       if(start%2!=0){
           start++;
       }if(Math.abs(start-end)<2){
           System.out.println("-1");
       }else{
           for(int i=0;i<3;i++){
               System.out.print(start+i+" ");
           }
       }
       
       
    }
    
}
