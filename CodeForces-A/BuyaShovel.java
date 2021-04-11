/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traing;

import java.util.Scanner;


public class BuyaShovel {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int cost=in.nextInt();
        int charge=in.nextInt();
        int result=cost;
        int count=1;
        while(result%10!=0&&result%10!=charge){
            result+=cost;
            count++;
        }
        System.out.println(count);
        
    }
    
}
