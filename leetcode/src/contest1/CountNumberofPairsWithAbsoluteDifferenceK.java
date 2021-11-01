package contest1;

public class CountNumberofPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {
   countKDifference(new int[] {1,2,2,1},1);
    }
    public static int countKDifference(int[] nums, int k) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(Math.abs(nums[i]-nums[j])==k) count++;
            }
        }
        return count;
    }
}
