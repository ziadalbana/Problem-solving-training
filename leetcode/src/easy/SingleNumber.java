package easy;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i+=2) {
            if(nums[i]!=nums[i+1]) return nums[i];
        }
        return nums[nums.length-1];
    }
}
