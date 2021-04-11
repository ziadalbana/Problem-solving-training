/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traing;

import java.util.ArrayList;
import java.util.Scanner;


public class TeamOlympiad {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int cases=in.nextInt();
        ArrayList<Integer> students = new ArrayList<Integer>();
       int i=0;
       int y=0;
       int numteam=(cases/3);
       ArrayList<Integer> teams = new ArrayList<Integer>();
       ArrayList<Integer> minteams = new ArrayList<Integer>();
       ArrayList<Integer> temp = new ArrayList<Integer>();
       int count=0;
       int countTeam=0;
       for(i=0;i<cases;i++){
           students.add(in.nextInt());
       }
       i=0;
       while(i<students.size()&&countTeam!=numteam){
            if(!minteams.contains(students.get(i))&&students.get(i)!=0){
                temp.add(i+1);
                 minteams.add(students.get(i));
                students.set(i, 0);
                count++;
                i=0;
            }else{
            i++;
            }
            if(count==3){
                for(y=0;y<3;y++){
                  teams.add(temp.get(y)); 
                }
                temp.clear();
                minteams.clear();
                count=0;
                countTeam++;
            }
       }
       count=0;
       if(countTeam==0){
           System.out.println(0);
       }else{
           System.out.println(countTeam);
           for(i=1;i<=teams.size();i++){
               System.out.print(teams.get(i-1)+" ");
               if(i%3==0){
                   System.out.println();
               }
           }
       }
        
        
    }    
    
}

