package medium;

import java.util.Arrays;
import java.util.Collections;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] n = new int[]{0,1,0,3,2,3};
        LongestIncreasingSubsequence m=new LongestIncreasingSubsequence();
       System.out.println(m.lengthOfLIS(n));
    }
    public int lengthOfLIS(int[] nums) {
        int[] d=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            d[i]=1;
        }
        int max=1;
        for (int i = 1; i <nums.length ; i++) {
            for (int j = 0; j < i; j++) {
                 if (nums[j]<nums[i]){
                     d[i]=Math.max(d[j]+1,d[i]);
                 }
            }
            if(max<d[i]) max=d[i];
        }
        return max;
    }
}
