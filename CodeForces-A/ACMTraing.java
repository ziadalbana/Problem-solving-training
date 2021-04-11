/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm.traing;

import java.util.Scanner;


public class ACMTraing {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long s=in.nextLong();
        long e=in.nextLong();
        int difference=(int) Math.abs(s-e);
        long i;
        long count=0;
        if(s!=e){
        for(i=1;i<=difference;i++){
            count+=i;
            if(count>=difference){
                break;
            }
        }
        }else{
            i=0;
        }
        System.out.println(i);
    }
    
}
