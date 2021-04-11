/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author Alex
 */
public class Queue {

    
    public static void main(String[] args) throws IOException {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
       StringTokenizer s = new StringTokenizer(in.readLine());
       int n=Integer.parseInt(s.nextToken());
       s=new StringTokenizer(in.readLine());
       int i,j;
       int result;
       int[] arr=new int[n];
        Point[] l = new Point[n]; 
       for(i=0;i<n;i++){
           l[i]=new Point();
           l[i].x=Integer.parseInt(s.nextToken());
           l[i].y=i;
       }
       Arrays.sort(l, (Point a, Point b) -> {
           return Integer.compare(a.x, b.x);
       });
       int postion=-1;
       for(i=0;i<n;i++){
           if (l[i].y > postion){
			postion= l[i].y;
			arr[l[i].y] = -1 ;
		}else {
			arr[l[i].y] = postion - l[i].y - 1 ;
		} 
       }
       for(i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
       
    }
   /* public static void sort(Point[] n){
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i].x>n[j].x){
                    int x=n[i].x;
                    int y=n[i].y;
                    n[i].x=n[j].x;
                    n[i].y=n[j].y;
                    n[j].x=x;
                    n[j].y=y;
                }
            }
        }
    }*/
    
}
