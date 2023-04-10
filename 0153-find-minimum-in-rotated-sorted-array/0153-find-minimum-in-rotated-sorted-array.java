class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[l]<=nums[mid]&&nums[mid]<=nums[r]) return nums[l];
            else if(nums[mid]>nums[r]) l=mid+1;
            else r=mid;
        }
        return -1;
    }
}