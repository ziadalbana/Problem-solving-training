class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int threshold=nums.length/2;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            if(map.get(n)>threshold) return n;
        }
        return -1;
       // Arrays.sort(nums);
       //  Stack<Integer> apperance=new Stack<>();
       //  apperance.add(nums[0]);
       //  for (int i = 1; i < nums.length; i++) {
       //      if(apperance.peek()==nums[i]) apperance.add(nums[i]);
       //      else{
       //          if(apperance.size()>nums.length/2) {
       //              return apperance.peek();
       //          }
       //          else{
       //              apperance.clear();
       //              apperance.add(nums[i]);
       //          }
       //      }
       //  }
       //  return apperance.peek();
    }
}