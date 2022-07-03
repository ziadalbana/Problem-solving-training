class Solution {
 public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int right=0,left=0,prod=1;
        if(k<=1) return 0;
        while (right<nums.length){
            prod*=nums[right];
            while (prod>=k&&left<nums.length) prod/=nums[left++];
            count+=right-left+1;
            right++;
        }
        return count;
    }
}