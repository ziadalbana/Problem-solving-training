package easy;

import java.util.HashSet;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
   int[] nums=new int[] {0,0,1,1,1,2,2,3,3,4};
      removeDuplicatess(nums);
    }
    public  static int removeDuplicates(int[] nums) {
        HashSet<Integer> appearance=new HashSet<>();
        int times=0;
        for (int i = 0; i < nums.length; i++) {
            if (appearance.contains(nums[i])&&nums[i]<110){
                times++;
                for (int j = i+1; j < nums.length; j++) {
                    nums[j-1]=nums[j];
                }
                i--;
                nums[nums.length-1]=110;
            }
            appearance.add(nums[i]);
        }
        return nums.length-times;
    }
    public static  int removeDuplicatess(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
