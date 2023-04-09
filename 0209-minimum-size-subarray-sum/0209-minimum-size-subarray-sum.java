class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int start=0;
        int length=Integer.MAX_VALUE;
        for(int end=0;end<nums.length;end++){
            sum+=nums[end];
            while(start<=end&&sum>=target){
                length=Integer.min(length,end-start+1);
                sum-=nums[start++];
            }
        }
        return length==Integer.MAX_VALUE? 0:length;
    }
}