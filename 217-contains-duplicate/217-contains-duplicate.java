class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> occurance=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(occurance.containsKey(nums[i])){
                return true;
            }else {
                occurance.put(nums[i],1);
            }  
        }
        return false;
    }
}