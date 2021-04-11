/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm.traing;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class HamadaAndSpreadsheets {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n;
       try{
       n=in.nextInt();
       }catch(Exception e){
           return;
       }
       int i,j;
       String[] words=new String[n];
       for(i=0;i<n;i++){
           words[i]=in.next();
       }
       String[] end=new String[n];
       Deque<Character> temp = new LinkedList<>(); 
       Deque<Character> tempnum = new LinkedList<>(); 
       String carry="";
       String slow = null;
       String result="";
       char c;
       int x;
       int y;
       int sum=0;
       int count=0;
       boolean status = false;
       boolean first=false;
       boolean second=false;
       i=0;j=0;
      for(i=0;i<n;i++){
           for(j=0;j<words[i].length();j++){
               c=words[i].charAt(j);
               if(temp.isEmpty()||((char)temp.peekLast()>='A'&&(char)temp.peekLast()<='Z'&&c>='A'&&c<='Z')){
                   temp.add(c);
               }else if((char)temp.peekLast()>='0'&&(char)temp.peekLast()<='9'&&c>='0'&&c<='9'){
                   temp.add(c);
               }
               else{
                   count++;
                   carry="";
                   while(!temp.isEmpty()){
                       carry+=(char) temp.pollFirst();
                   }
                   status=true;
                   j--;
                   
               }
               if(words[i].length()-1==j){
                count++;
                   carry="";
                   while(!temp.isEmpty()){
                       carry+=(char) temp.pollFirst();
                   }
                   status=true;   
               }
               if(status==true){
                   status=false;
                   if(count==1&&"R".equals(carry)){
                      second=true;
                  }else if(count==1&&!"R".equals(carry)){
                      first=true;
                      result+="R";
                      slow=carry;
                  }else if(count==2&&first){
                      for(y=slow.length()-1;y>=0;y--){
                          x= (slow.charAt(slow.length()-1-y)-64);
                          sum+=Math.pow(26,y)*x;
                      }
                      result+=carry;
                      result+="C";
                      result+=sum;
                      System.out.println(result);
                      result="";
                      count=0;
                      sum=0;
                  }else if(count==2&&second){
                    slow=carry;
                  }else if(count==4&&second){
                      x=Integer.parseInt(carry);
                      carry="";
                      while(x>0){
                           if (x % 26 == 0) {
                               tempnum.addFirst('Z');
                               x -= 26;
                               x /= 26;
                               continue;
                           }
                           tempnum.addFirst((char) (x % 26 + 64));
                           x /= 26;
                       }
                    while(!tempnum.isEmpty()){
                      carry+=tempnum.pollFirst();
                    } 
                      result+=carry;
                      result+=slow;
                       System.out.println(result);
                       result="";
                       count=0;
                       sum=0;x=0;
                  }
                }
           }
           first=false;
           second=false; 
        }
    } 
    
    
}
