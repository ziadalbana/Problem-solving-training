package easy;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum s=new TwoSum();
        s.twoSum(new int[]{3,2,4},6);
    }
    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i!=j){
                    int temp=nums[i]+nums[j];
                    if (temp==target){
                        result=new int[]{i,j};
                        return result;
                    }
                }
            }
        }
        return result;
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> positions=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            positions.put(nums[i],i );
        }
        for (int i = 0; i <nums.length ; i++) {
            if (positions.containsKey(target-nums[i])&&positions.get(target-nums[i])!=i){
                return new int[]{i,positions.get(target-nums[i])};
            }
        }
        return null;
    }
}
