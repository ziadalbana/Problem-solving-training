package easy;

import java.util.Arrays;
import java.util.Collections;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes n=new MoveZeroes();
       n.moveZeroes(new int[]{0,0,1});
    }
    public void moveZeroes(int[] nums) {
      if(nums.length==1) return;
      int endPointer=nums.length-1;
      int i=0;
        for (int j = 0; j <nums.length ; j++) {
             if (nums[j]==0){
                 shift(nums,i,endPointer);
                 endPointer--;
             }else {
                 i++;
             }
        }
    }
    private void shift(int[] nums,int i,int j){
        for (int k = i; k <j; k++) {
            nums[k]=nums[k+1];
        }
        nums[j]=0;
    }
}
