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
}