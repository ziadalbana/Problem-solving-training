class Solution {
    public  int[] searchRange(int[] nums, int target) {
        int l=lower(nums,target);
        int u=upper(nums,target);
        if(l==-1||u==-1)  return new int[]{-1,-1};
        return new int[]{l,u};

    }
  private int lower(int[] nums,int target){
        if(nums.length==0) return -1;
        int result=-1;
        int l=0;int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]<target) l=mid+1;
            else if(nums[mid]<target) r=mid-1;
            else {
                result=mid;
                r-=1;
            }
        }
        return  result;
    }
    private int upper(int[] nums,int target){
        if(nums.length==0) return -1;
        int l=0;int r=nums.length-1;
        int result=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]<target) l=mid+1;
            else if(nums[mid]>target) r=mid-1;
            else {
                result=mid;
                l=mid+1;
            }
        }
        return result;
    }
    
}