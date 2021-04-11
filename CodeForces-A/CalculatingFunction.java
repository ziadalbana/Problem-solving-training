/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class CalculatingFunction {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long result;
        if(n%2==0){
            result=n/2;
        }else{
            result=-(n-n/2);
        }
        System.out.println(result);
    }
    
}
