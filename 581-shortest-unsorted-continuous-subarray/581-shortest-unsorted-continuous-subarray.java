class Solution {
    public int findUnsortedSubarray(int[] arr) {
    int low=0,high=arr.length-1;
    while(low<arr.length-1&&arr[low]<=arr[low+1]) low++;
    while(high>1&&arr[high]>=arr[high-1]) high--;
    if(low==arr.length-1) return 0;
    int subMin=Integer.MAX_VALUE,subMax=Integer.MIN_VALUE;
    for(int i=low;i<=high;i++){
     subMin=Integer.min(subMin,arr[i]);
     subMax=Integer.max(subMax,arr[i]);
    }
    while(low>0&&arr[low-1]>subMin) low--;
    while(high<arr.length-1&&arr[high+1]<subMax) high++;

    return high -low+1;
    }
}