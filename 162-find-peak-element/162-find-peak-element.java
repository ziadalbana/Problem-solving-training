class Solution {
    public int findPeakElement(int[] nums) {
          return checkPeak(nums,0,nums.length-1);
    }
    private int checkPeak(int[] nums,int left,int right){
        int mid=(left+right)/2;
        if(left==right) return left;
        else if(nums[mid]>nums[mid+1]) return checkPeak(nums,left,mid);
        return checkPeak(nums,mid+1,right);
    }
}