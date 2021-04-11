
package javaapplication22;

import java.util.Scanner;


public class OlesyaandRodion {

    
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int t=in.nextInt();
    String result="";
    int i;
    if(t!=10){
    for(i=0;i<n;i++){
        result+=t;
    }
    }
    else if(t==10&&n==1){
        result="-1";
    }else if(t==10&&n!=1){
        result+=1;
       for(i=1;i<n;i++){
           result+=0;
       }
    }
    
    System.out.println(result);
    
    
    }
    
}
