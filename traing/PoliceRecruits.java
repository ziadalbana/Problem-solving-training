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
public class PoliceRecruits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = 0;
        int i=0;
        int hire=0,crimes=0;
        int result=0;
        cases=in.nextInt();
        int[] arr=new int[cases];
        for(i=0;i<cases;i++){
           arr[i]=in.nextInt();
        }
        for(i=0;i<cases;i++){
           if(arr[i]>0){
               hire+=arr[i];
           }else{
           crimes=1;
           hire=hire-crimes;
           if(hire<0){
               result+=1;
               hire=0;
           }
           }
        }
        System.out.println(result);
        
                
    }
    
}
