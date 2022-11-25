class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lower= findLower(nums,target);
        int upper=findUpper(nums,target);
         return new int[]{lower,upper};
    }
    private int findLower(int[] nums,int target){
        int l=0,r=nums.length-1;
        int result=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(target==nums[mid]){
                result=mid;
                r--;
            }else if(nums[mid]>target) r=mid-1;
            else l=mid+1;
        }
        return result;
    }
    private int findUpper(int[] nums,int target){
        int l=0,r=nums.length-1;
        int result=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(target==nums[mid]){
                result=mid;
                l++;
            }else if(nums[mid]>target) r=mid-1;
            else l=mid+1;
        }
        return result;
    }
    
}