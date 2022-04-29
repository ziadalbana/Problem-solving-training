package medium;

import java.util.HashMap;
import java.util.Map;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        IncreasingTripletSubsequence n=new IncreasingTripletSubsequence();
        n.increasingTriplet(new int[]{20,100,10,12,5,13});
    }
    public boolean increasingTriplet(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (min>=nums[i]){
                min=nums[i];
            }else if(max>=nums[i]){
                max=nums[i];
            }else return true;
        }
      return false;
    }
}
