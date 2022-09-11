class Solution {
        
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> positions=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            positions.put(nums[i],i );
        }
        for (int i = 0; i <nums.length ; i++) {
            if (positions.containsKey(target-nums[i])&&positions.get(target-nums[i])!=i){
                return new int[]{i,positions.get(target-nums[i])};
            }
        }
        return null;
    }
    // public int[] twoSum(int[] nums, int target) {
    //     Arrays.sort(nums);
    //     int left=0,right=nums.length-1;
    //     while(left<right){
    //         int sum=nums[left]+nums[right];
    //         if(sum==target) return new int[]{left,right};
    //         else if(sum>target) right--;
    //         else left++;
    //     }
    //     return new int[]{-1,-1};
    // }
}