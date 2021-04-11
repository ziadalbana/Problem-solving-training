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
public class DieRoll {


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int y;
        int w;
        int result;
        int correct;
        y=in.nextInt()-1;
        w=in.nextInt()-1;
        if(y>w){
            result=6-y;
        }else{
            result=6-w;
        }
        
        
        
       //System.out.println(result+"/"+count);
    }
    
}
