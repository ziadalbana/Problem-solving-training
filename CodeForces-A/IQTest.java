
package javaapplication22;

import java.util.Scanner;


public class IQTest {

    
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     char[][] test=new char[4][4];
     int i,j;
     String temp;
     int countblack=0,countwhite=0;
     for(i=0;i<4;i++){
         temp=in.next();
         for(j=0;j<4;j++){
             test[i][j]=temp.charAt(j);
            }
        }
      for(i=0;i<3;i++){
          for(j=0;j<3;j++){
              if(test[i][j]=='#'){
                  countblack++;
              }if(test[i][j+1]=='#'){
                  countblack++;
              }if(test[i+1][j]=='#'){
                  countblack++;
              }if(test[i+1][j+1]=='#'){
                  countblack++;
              }
              if(countblack==3||countblack==4){
                  System.out.println("YES");
                  return;
              } if(test[i][j]=='.'){
                  countwhite++;
              }if(test[i][j+1]=='.'){
                  countwhite++;
              }if(test[i+1][j]=='.'){
                  countwhite++;
              }if(test[i+1][j+1]=='.'){
                  countwhite++;
              }
              if(countwhite==3||countwhite==4){
                  System.out.println("YES");
                  return;
              }
              countblack=0;
              countwhite=0;
          }
      }
      System.out.println("NO");
    }
    
}
