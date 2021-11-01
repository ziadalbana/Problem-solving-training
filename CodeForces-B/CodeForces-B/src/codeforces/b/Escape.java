package codeforces.b;


import java.io.IOException;
import java.util.Scanner;


public class Escape {
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        int vp=in.nextInt();
        int vd=in.nextInt();
        int t=in.nextInt();  // delay first dragon time
        int f= in.nextInt(); //time at cave
        int c=in.nextInt();
        int distanceCovered=(t*vp);
        int Catch=0;
        int count=0;
        while(distanceCovered<c){
            int time;
             if(Catch>=distanceCovered){
                time=f+((distanceCovered)/vd);
                Catch=0;
                distanceCovered+=time*vp;
                count++;
            }
           else if(Catch<distanceCovered){
                distanceCovered+=vp;
                Catch+=vd;
            }
        }
        System.out.println(count);
    }

}
