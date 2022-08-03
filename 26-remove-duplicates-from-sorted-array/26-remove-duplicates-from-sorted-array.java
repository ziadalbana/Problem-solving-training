class Solution {
    public int removeDuplicates(int[] arr) {
    // HashSet<Integer> appearance=new HashSet<>();
    //     int times=0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (appearance.contains(nums[i])&&nums[i]<110){
    //             times++;
    //             for (int j = i+1; j < nums.length; j++) {
    //                 nums[j-1]=nums[j];
    //             }
    //             i--;
    //             nums[nums.length-1]=110;
    //         }
    //         appearance.add(nums[i]);
    //     }
    //     return nums.length-times;
    if(arr.length<2) return 1;
    int slow=0,fast=1,count=0;
    while(fast<arr.length){
      if(arr[slow]!=arr[fast]){
        arr[slow+1]=arr[fast];
          slow++;
      }else count++;
      fast++;
    }
    
    return arr.length-count;
  }
}