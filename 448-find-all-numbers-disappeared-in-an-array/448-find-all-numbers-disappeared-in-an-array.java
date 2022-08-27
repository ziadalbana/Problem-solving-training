class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
    // TODO: Write your code here
    int i=0;
    while(i<nums.length){
      int j=nums[i]-1;
      if(nums[i]!=nums[j]) swap(nums,i,j);
      else i++;
    }
    for(i=0;i<nums.length;i++){
      if(nums[i]!=i+1) missingNumbers.add(i+1);

    }
    return missingNumbers;
  }
  private static void swap(int[] nums,int x,int y){
    int temp=nums[x];
    nums[x]=nums[y];
    nums[y]=temp;
  }
}