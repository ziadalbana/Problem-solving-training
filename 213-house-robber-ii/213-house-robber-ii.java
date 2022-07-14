class Solution {

    public int rob(int[] nums) {
        if (nums.length==1) return nums[0];
        return Integer.max(rob(nums,0, nums.length-2),rob(nums,1, nums.length-1));
    }
    private int rob(int[] nums,int lo,int hi){
         int include=0,exclude=0;
        for (int i = lo; i <=hi; i++) {
            int in=include,ex=exclude;
            include=ex+nums[i];
            exclude=Integer.max(in,ex);
        }
        return Integer.max(include,exclude);
    }


}