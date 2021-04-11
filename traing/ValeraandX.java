
package javaapplication22;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class ValeraandX {

   
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     String[] test=new String[n];
     int i,j;
     int count=0;
      for(i=0;i<n;i++){
            test[i]=in.next();
        }
      for(i=0;i<n/2;i++){
          if(test[i] == null ? test[n-1-i] != null : !test[i].equals(test[n-1-i])){
              count++;
              break;
          }
      }
      if(count==0){
        int mid=n/2;
        for(i=0;i<n/2;i++){
          if(test[mid].charAt(i)!=test[mid].charAt(n-1-i)){
              count++;
              break;
            }
        }
        if(test[mid].charAt(mid)!=test[0].charAt(0)||test[mid].charAt(mid)==test[mid].charAt(0)){
              count++;
            }
        }
      
    
      if(count>0){
        System.out.println("NO");
      }else{
         System.out.println("YES");  
      }
      
    }
    
}
