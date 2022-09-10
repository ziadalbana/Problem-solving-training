class Solution {
    public int findMin(int[] arr) {
        int left=0,right=arr.length-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if(arr[left]<=arr[mid]&&arr[mid]<=arr[right]) return arr[left];
            else if(arr[left]>arr[mid]&&arr[mid]<arr[right]) right=mid;
            else left=mid+1;
        }
        return arr[left];
        // int l=0;int r=nums.length-1;
        // int min=Integer.MAX_VALUE;
        // while(l<=r){
        //     int mid=l+(r-l)/2;
        //     if(nums[l]<=nums[mid]&&nums[mid]<=nums[r]) return nums[l];
        //     else if(nums[l]<=nums[mid]&&nums[mid]>=nums[r]) l=mid+1;
        //     else if(nums[mid]<=nums[r]&&nums[l]>nums[mid]) r=mid;
        // }
        // return -1;
    }
}