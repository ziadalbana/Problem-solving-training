class Solution {
    public int singleNumber(int[] nums) {
    int x1=nums[0];
    for(int i=1;i<nums.length;i++) x1^=nums[i];
    return x1;
    }
}