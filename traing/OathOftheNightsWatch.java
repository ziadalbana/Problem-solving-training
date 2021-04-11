
package traing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class OathOftheNightsWatch {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int i;
        int result=0;
         ArrayList<Integer>  power = new ArrayList<>();
         for(i=0;i<num;i++){
             power.add(in.nextInt());
         }
         Collections.sort(power);
         for(i=0;i<num;i++){
             if(power.get(i)>power.get(0)&&power.get(i)<power.get(power.size()-1)){
                 result++;
             }
            
         }
        
        System.out.println(result);
         
    }
    
}
