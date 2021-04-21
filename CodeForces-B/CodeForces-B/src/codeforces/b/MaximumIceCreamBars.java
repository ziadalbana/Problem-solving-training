
package codeforces.b;

import java.util.Arrays;
import java.util.Scanner;


public class MaximumIceCreamBars {

   
    public static void main(String[] args) {
       int[] costs = new int[]{1,3,2,4,1};
       int coins = 7;
       System.out.print(maxIceCream(costs,coins));
    }
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0,count=0;
        for(int i=0;i<costs.length;i++){
            if(sum+costs[i]<=coins){
                sum+=costs[i];
                count++;
            }else{
              break;  
            }
        }
        return count; 
    }
    
}
