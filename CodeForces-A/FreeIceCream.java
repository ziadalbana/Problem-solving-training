/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traing;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class FreeIceCream {

    
    public static void main(String[] args) {
         Scanner in =new Scanner(System.in);
         int cases=in.nextInt();
         long ice=in.nextInt();
         in.nextLine();
         char  sign;
         int count=0;
         long check=0;
         int num=0;
         for(int i=0;i<cases;i++){
             sign=in.next().charAt(0);
             num=in.nextInt();
             if(sign=='+'){
                 ice+=num;
             }else{
                 check= (ice-num);
                 if(check<0)
                 {
                     count++;
                 }else{
                     ice-=num;
                 }
             }
         }
        System.out.println(ice+" "+count);
    }
    
}
