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
public class Team {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int problemNumber=0;
       int cases=input.nextInt();
        String opinon=input.nextLine();
        for(int i=0;i<cases;i++){
            opinon=input.nextLine();
            problemNumber+=check(opinon);
        }
        System.out.println(problemNumber);
    }
    public static int check(String opinon){
        int sure=0;
        int result;
        for(int i=0;i<opinon.length();i+=2){
            if(opinon.charAt(i)=='1'){
                sure++;
            }
        }
        if(sure>=2){
            result=1;
        }else{
            result=0;
        }
     return result;           
    } 
    
    
}
