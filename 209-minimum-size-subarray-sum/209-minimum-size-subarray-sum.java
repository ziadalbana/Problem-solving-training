class Solution {
      public int minSubArrayLen(int target, int[] nums) {
        int sum=0,count=Integer.MAX_VALUE, left=0;
          for(int i=0;i<nums.length;i++){
              sum+=nums[i];
              while(sum>=target) {
                  count=Integer.min(count,(i-left+1));
                  sum-=nums[left++];
              }
          }
          
        return (count != Integer.MAX_VALUE) ? count : 0;
    }
}