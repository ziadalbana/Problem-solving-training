class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
    List<List<Integer>> quadruplets = new ArrayList<>();
    // TODO: Write your code here
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){
      if(i>0&&arr[i-1]==arr[i]) continue;
      searchTriple(arr,target,arr[i],i+1,quadruplets);
    }
    return quadruplets;
  }
  private static void searchTriple(int[] arr, int target,int curr,int left,List<List<Integer>> quadruplets){
     for(int i=left;i<arr.length;i++){
       if(i>left&&arr[i-1]==arr[i]) continue;
       searchPair(arr,target,curr,arr[i],i+1,quadruplets);
     }
  }
  private static void searchPair(int[] arr, int target,int prev,int curr,int left,List<List<Integer>> quadruplets){
    int right=arr.length-1;
    while(left<right){
     long sum= ((long)arr[left]+(long) arr[right]+(long)curr+(long)prev);
      if(sum==target){
        quadruplets.add(Arrays.asList(arr[left++],arr[right--],curr,prev));
        while(left<right&&arr[left]==arr[left-1]) left++;
        while(left<right&&arr[right]==arr[right+1]) right--;  
      }
      else if(sum>target) right--;
      else left++;
    }
  }
}