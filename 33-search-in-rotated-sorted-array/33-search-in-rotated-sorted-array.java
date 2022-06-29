class Solution {
  public int search(int[] nums, int target) {
      int l=0;int r=nums.length-1;
      int result=-1;
      while(l<=r){
        int mid =l+(r-l)/2;
        if(nums[mid]==target){
          return mid;
        }
        if(nums[l]<=nums[mid]){
              if(nums[mid]>target&&target>=nums[l]) r=mid-1;
              else l=mid+1;
        }
        if(nums[mid]<=nums[r]){
            if(nums[mid]<target&&target<=nums[r]) l=mid+1;
            else r=mid-1;
        }
      }
  return -1;
  
  }
    //  public int search(int[] nums, int target) {
    //    int l=0;int r= nums.length-1;
    //    int mid=(r-l)/2;
    //    int ans;
    //    //if(nums.length==1&&nums[0]==target) return 0;
    //     if (target==nums[mid]) return mid;
    //     if (target<nums[mid]) {
    //         ans=search(nums,target,l,mid);
    //         if(ans==-1) return search(nums,target,mid+1,r);
    //         else return ans;
    //     }else {
    //         ans=search(nums,target,mid,r);
    //         if(ans==-1) return search(nums,target,l,mid-1);
    //         else return ans;
    //     }
    // }
    // private int search(int[] nums,int target,int l,int r){
    //     int ans;
    //     int mid=(r+l)/2;
    //     if (l>r) return -1;
    //     if (target==nums[mid])  return mid;
    //     if (target<nums[mid]) {
    //         ans=search(nums,target,l,mid-1);
    //         if(ans==-1) return search(nums,target,mid+1,r);
    //         else return ans;
    //     }
    //     else if(target>nums[mid]){
    //         ans=search(nums,target,mid+1,r);
    //         if(ans==-1) return search(nums,target,l,mid-1);
    //         else return ans;
    //     }
    //     return -1;
    // }
}