package medium;

import java.util.ArrayList;
import java.util.Hashtable;

public class SearchforaRange {
    public static void main(String[] args) {
      SearchforaRange n=new SearchforaRange();
      n.searchRange(new int[]{5,7,7,8,8,10},8);
    }
    public  int[] searchRange(int[] nums, int target) {
        if(nums.length==0)  return new int[]{-1,-1};
        if (nums.length==1&&nums[0]==target) return new int[]{0,0};
        else if (nums.length==1&&nums[0]!=target)  return new int[]{-1,-1};
        int l=searchLeft(nums,target);
        int r=searchRight(nums,target);
        return new int[]{l,r};
    }
   private  int searchLeft(int[] nums,int target){
       int l=0;int r= nums.length-1;
       while (l<r){
           int mid=(l+r)/2;
           if (nums[mid]<target) l=mid+1;
           else r=mid;
       }
       return nums[l]==target ? l:-1;
   }
   private int searchRight(int[] nums,int target){
        int l=0; int r= nums.length-1;
        while (l<r){
            int mid=(l+r)/2;
            if (nums[mid]<=target) l=mid+1;
            else r=mid;
        }
       return nums[l-1]==target ? l-1:-1;
   }
}
