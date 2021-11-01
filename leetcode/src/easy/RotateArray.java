package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RotateArray {
    public static void main(String[] args) {
   rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }
    public static  void rotate(int[] nums, int k) {
       int rotates=k%nums.length;
       if (rotates==0) return;
        Queue<Integer> temp=new LinkedList<>();
        for (int i = 0; i < nums.length-rotates ; i++) {
            temp.add(nums[i]);
        }
        int j=0;
        for (int i = nums.length-rotates; i < nums.length; i++) {
            nums[j]=nums[i];
            j++;
        }
        while(!temp.isEmpty()){
            nums[j]=temp.poll();
            j++;
        }
    }
}
