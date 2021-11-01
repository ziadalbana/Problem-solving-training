package medium;

public class FindPeakElement {
    public static void main(String[] args) {
        findPeakElement(new int[]{1,2,3,1});
    }
    public static int findPeakElement(int[] nums) {
          return checkPeak(nums,0,nums.length-1);
    }
    private static int checkPeak(int[] nums,int left,int right){
       int mid=(left+right)/2;
       if(left==right) return left;
       else if(nums[mid]>nums[mid+1]) return checkPeak(nums,left,mid);
       return checkPeak(nums,mid, right);
    }

}
