package easy;

import java.util.Arrays;
import java.util.Collections;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
      if(nums.length==1) return;
      int endPointer=nums.length-1;
        for (int i = 0; i < endPointer; i++) {
           if (nums[i]==0) swap(nums,i,endPointer--);
        }
    }
    private void swap(int[] nums,int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}
