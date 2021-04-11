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
public class ShaassandOskols {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int wire=in.nextInt();
         int i;
         int shots;
         int location;
         int birdPostion;
         int [] birds=new int[wire];
         for(i=0;i<wire;i++){
             birds[i]=in.nextInt();
         }
         shots=in.nextInt();
         int[] information=new int[shots*2];
         for(i=0;i<2*shots;i++){
         information[i]=in.nextInt();
         }
         for(i=0;i<2*shots-1;i+=2){
             location=information[i]-1;
             birdPostion=information[i+1];
             if(wire==1){
                 birds[0]=0;
                 break;
             }
            else if(location==0){
                 birds[1]+=(birds[0]-birdPostion);
                 birds[0]=0;
             }
             else if(location==wire-1){
                 birds[location-1]+=(birdPostion-1);
                 birds[location]=0;
             }else{
                 birds[location-1]+=birdPostion-1;
                 birds[location+1]+=(birds[location]-birdPostion);
                 birds[location]=0; 
             }
         }
         for(i=0;i<wire;i++){
             System.out.println(birds[i]);
         }
    
    }
    
}
