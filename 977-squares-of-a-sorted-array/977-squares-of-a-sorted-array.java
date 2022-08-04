class Solution {
    public int[] sortedSquares(int[] arr) {
        // int[] result=new int[nums.length];
        // int lo=0,hi=nums.length-1;
        // for(int i=nums.length-1;i>=0;i--){
        //     if(Math.abs(nums[lo])>=Math.abs(nums[hi])){
        //         result[i]=nums[lo]*nums[lo];
        //         lo++;
        //     }else{
        //         result[i]=nums[hi]*nums[hi];
        //         hi--;
        //     }
        // }
        // return result;
        int[] squares = new int[arr.length];
    // TODO: Write your code here
    int left =0,right=arr.length-1;
    for(int i=arr.length-1;i>=0;i--){
      int lnum=arr[left]*arr[left];
      int Rnum=arr[right]*arr[right];
      if(lnum>Rnum){
         squares[i]=lnum;
         left++;
      }else{
        squares[i]=Rnum;
        right--;
      }
    }
    return squares;
        
    }
}