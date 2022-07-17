class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> occurance=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!occurance.add(nums[i])) return true;   
        }
        return false;
    }
}