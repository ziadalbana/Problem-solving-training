class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    List<Integer> duplicateNumbers = new ArrayList<>();
    int i=0;
    while(i<nums.length){
      int j=nums[i]-1;
      if(nums[i]!=nums[j]) swap(nums,i,j);
      else i++;
    }
    for(i=0;i<nums.length;i++){
      if(nums[i]-1!=i) duplicateNumbers.add(nums[i]);
    }
    return duplicateNumbers;
  }
  private static void swap(int[] nums,int x,int y){
    int temp=nums[x];
    nums[x]=nums[y];
    nums[y]=temp;
  }
}