class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=searchLeft(nums,target);
        int r=searchRight(nums,target);
        return new int[]{l,r};
    }
    private int searchLeft(int[] nums,int target){
        int l=0,r=nums.length-1;
        int result=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                result=mid;
                r--;
            }else if(nums[mid]<target) l=mid+1;
            else r=mid-1;
        }
        return result ;
    }
    private int searchRight(int[] nums,int target){
          int l=0,r=nums.length-1;
          int result=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                result=mid;
                l++;
            }
            else if(nums[mid]<target) l=mid+1;
            else r=mid-1;
        }
        return result ;
    }
}