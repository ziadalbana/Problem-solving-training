class Solution {
    public int threeSumClosest(int[] arr, int targetSum) {
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int left=i+1; int right=arr.length-1;
            while(left<right){
                int sum=arr[left]+arr[right]+arr[i];
                int diff=targetSum-sum;
                if(Math.abs(minDiff)>Math.abs(diff)){
                    minDiff=diff;
                }
                if(diff<0) right--;
                else left++;
            }
        }
        return targetSum-minDiff;
    }
}