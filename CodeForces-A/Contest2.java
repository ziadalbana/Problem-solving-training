/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Contest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String word=in.next();
        String result="";
        String temp="";
        int i=0,s1;
        int cnt=1;
        int j=0;
        int times=0;
       Queue n1=new LinkedList();
       char c = 0;
      for(i=0;i<=word.length();i++){
          if(i<word.length()){
              c=word.charAt(i);
          }
          s1=n1.size();
          if(n1.isEmpty()){
              n1.add(c);
          }else if(i==word.length()||(char)n1.peek()!=c){
              if(s1==1){
                  result+=n1.poll();
                  cnt=1;
              }else if((i==word.length()&&cnt==1)||(cnt==1&&s1==2)){
                   result+=n1.poll();
                   result+=n1.poll();
                   cnt++;
              }else if(cnt==2&&s1==2){
                  result+=n1.poll();
                  n1.clear();
                  cnt=1;
              }else if(s1%2==0&&s1%3==0&&word.length()!=3){
                  for(j=0;j<s1/3;j++){
                      result+=n1.poll();
                  }
                  n1.clear();
                  cnt=1;
              }else if(s1%2!=0){
                  int num3=s1/3;
                  int num2=(s1-(3*num3))/2;
                  if(num2!=0){
                  times=(s1-(3*num3))-(num2/2);
                  }
                  for(j=0;j<num3;j++){
                      result+=n1.poll();
                  }
                  for(j=0;j<times;j++){
                      result+=n1.poll();
                  }
                  
              }
              else if(s1%2==0){
                  for(j=0;j<s1/2;j++){
                      result+=n1.poll();
                  }
                  n1.clear();
                  cnt=1;
              } 
              n1.add(c);
          }else {
              n1.add(c);
          }
      }
       
        System.out.println(result);
    }
    
}
