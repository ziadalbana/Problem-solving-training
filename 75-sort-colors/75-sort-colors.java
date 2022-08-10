class Solution {
    public void sortColors(int[] arr) {
      // int[] c=new int[3];
      //   for (int i = 0; i < nums.length; i++) {
      //       c[nums[i]]+=1;
      //   }
      //   for (int i = 0; i < nums.length; i++) {
      //       if(c[0]>0){
      //           nums[i]=0;
      //           c[0]--;
      //       }else if(c[1]>0){
      //           nums[i]=1;
      //           c[1]--;
      //       }else{
      //           nums[i]=2;
      //           c[2]--;
      //       }
      //   }
        int low=0;
        int high=arr.length-1;
        int i=0;
        while (i<=high){
            if(arr[i]==1) i++;
            else if(arr[i]==0){
                swap(arr,low,i);
                low++;
                i++;
            }else{
                swap(arr,high,i);
                high--;
            }
        }
    }
     private static void swap (int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}