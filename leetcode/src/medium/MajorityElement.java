package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MajorityElement {
    public static void main(String[] args) {
    majorityElement(new int[]{3,2,3});
    }
    public static  int majorityElement(int[] nums) {
        Arrays.sort(nums);
        Stack<Integer> apperance=new Stack<>();
        apperance.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if(apperance.peek()==nums[i]) apperance.add(nums[i]);
            else{
                if(apperance.size()>nums.length/2) {
                    return apperance.peek();
                }
                else{
                    apperance.clear();
                    apperance.add(nums[i]);
                }
            }
        }
        return apperance.peek();
    }
}
