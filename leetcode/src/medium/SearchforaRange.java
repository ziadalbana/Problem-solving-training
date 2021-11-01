package medium;

public class SearchforaRange {
    public static void main(String[] args) {
        searchRange(new int[]{2,2},1);
    }
    public static int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};
        int lower=lowerbound(nums,target,0,nums.length-1);
        int upper=upperbound(nums,target,0,nums.length-1);
        if(upper>0&&nums[lower]!=target&&nums[upper]!=target) return new int[]{-1,-1};
        return new int[]{lower,upper};

    }
    private static int lowerbound(int[] nums,int target,int left,int right){
        int mid=(left+right)/2;
        if(left>=right) return mid;
        if(nums[mid]>=target) return lowerbound(nums,target,left,mid);
        else return lowerbound(nums,target,mid+1,right);
    }
    private static int upperbound(int[] nums,int target,int left,int right){
        int mid= (left+right)/2;
        if(left>=right) {
            if (nums.length == 1) return 0;
            else return mid - 1;
        }
        if(nums[mid]>target) return upperbound(nums,target,left,mid);
        else return upperbound(nums,target,mid+1,right);
    }
}
