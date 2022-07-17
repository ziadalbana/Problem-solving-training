class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> occurance=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(occurance.contains(nums[i])) return true;
             occurance.add(nums[i]);   
        }
        return false;
    }
}