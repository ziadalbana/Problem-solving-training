class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int windowStart=0;
        int product=1;
        if(k<=0) return 0;
        for(int windowEnd=0;windowEnd<nums.length;windowEnd++){
            product*=nums[windowEnd];
            while(product>=k&&windowStart<=windowEnd) product/=nums[windowStart++];
            count+=windowEnd-windowStart+1;
        }
        return count;
    }
}