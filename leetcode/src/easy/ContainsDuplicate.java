package easy;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> occurance=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(occurance.containsKey(nums[i])){
                occurance.replace(nums[i], occurance.get(nums[i])+1);
            }else {
                occurance.put(nums[i],1);
            }
        }
        for (Integer n: occurance.values()) {
            if(n>1) return true;
        }
        return false;
    }
}
