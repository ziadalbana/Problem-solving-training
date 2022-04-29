package medium;

import java.util.ArrayList;
import java.util.HashMap;

public class micro {
    public static void main(String[] args) {
        micro n=new micro();
        // [[1, 0, 1, 1, 0, 0, 0, 1, 0], 3, 2]
        n.solution(new int[]{1, 0, 1, 1, 0, 0, 0, 1, 0} ,3,2);
    }
    public boolean solution(int[] A, int Y, int Z) {
        // write your code in Java 11
        HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
        for (int i = 0; i < Y; i++) {
            map.put(i,new ArrayList<>());
        }
        int e=A.length/Y;
        int count=0;
        for (int i = 0; i < A.length; i+=Y) {
            int y=0;
            for (int j = i; j <i+Y ; j++) {
                if (A[j]==1) map.get(y).add(count);
                y++;
            }
            count++;
        }
        for (int i = 0; i < Y; i++) {
            if (map.get(i).size()<Z) return false;
        }
        return true;
    }
}
