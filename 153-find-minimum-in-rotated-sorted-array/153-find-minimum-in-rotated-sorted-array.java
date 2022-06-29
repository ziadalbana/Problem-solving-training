class Solution {
    public int findMin(int[] nums) {
        int l=0;int r=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[l]<=nums[mid]&&nums[mid]<=nums[r]) return nums[l];
            else if(nums[l]<=nums[mid]&&nums[mid]>=nums[r]) l=mid+1;
            else if(nums[mid]<=nums[r]&&nums[l]>nums[mid]) r=mid;
        }
        return -1;
    }
}