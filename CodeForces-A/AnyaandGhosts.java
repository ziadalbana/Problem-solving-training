/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.Arrays;
import java.util.Scanner;


public class AnyaandGhosts {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int ghost=in.nextInt();
        int buringTime=in.nextInt();
        int cundleburn=in.nextInt();
        int[] timing=new int[cundleburn];
        int[] coming=new int[ghost];
        Arrays.fill(coming,0);
        int i;
        int cnt=0;
        int count=0;
        int x=1;
        for(i=0;i<ghost;i++){
            coming[i]=in.nextInt();
        }
        for(i=0;i<ghost;i++){
            for(int j=0;j<cundleburn;j++){
                if(timing[j]<=coming[i]){
                timing[j]=coming[i]-x+buringTime+1;
                cnt++;
                x++;
                }
                if(timing[j]>coming[i]){
                    count++;
                }
            }
            x=1;
            if(count!=cundleburn){
                cnt=-1;
                break;
            }
            count=0;
        }
        System.out.println(cnt);
    }
    
}
