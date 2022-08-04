class Solution {
     public List<List<Integer>> threeSum(int[] arr) {
        if (arr.length<3) return new ArrayList<>();
        List<List<Integer>> triplets = new ArrayList<>();
    // TODO: Write your code here
    Arrays.sort(arr);
    int left=0;int right=arr.length-1;
    int sum=0;
    for(int i=0;i<arr.length;i++){
      if(i>0&&arr[i-1]==arr[i]) continue;
      searchPair(arr,-arr[i],triplets,i+1);
    }
    return triplets;
  }
  private void searchPair(int[] arr,int target, List<List<Integer>> res,int left){
    int right=arr.length-1;
    while(left<right){
      int sum=arr[left]+arr[right];
      if(sum==target){
      res.add(Arrays.asList(arr[left++],arr[right--],-target));
      while(left<right&&arr[left-1]==arr[left]) left++;
      while(left<right&&arr[right+1]==arr[right]) right--;
      }
      else if(sum>target) right--;
      else left++;
    }
  }
}