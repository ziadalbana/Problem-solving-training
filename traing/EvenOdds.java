
package traing;

import java.util.ArrayList;
import java.util.Scanner;


public class EvenOdds {

   
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      long n=in.nextLong();
      long k=in.nextLong();
      long num = 0;
      long midpoint=(long)Math.ceil((double)n/2);
     // System.out.println(midpoint);
      if(k<=midpoint){
        num= ((k-1)*2+1);
      }else{
        num= ((k-midpoint)*2);   
      }
      System.out.println(num);
    }
    
}
