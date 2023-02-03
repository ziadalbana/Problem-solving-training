class Solution {
    public int maxArea(int[] height) {
        int start=0,end=height.length-1; 
        int maxWater=0;
        while(start<end){
            int val=(end-start)* Integer.min(height[start],height[end]);
            if(height[start]<height[end]){
                maxWater=Integer.max(maxWater,height[start]*(end-start));
                start++;
            }else{
               maxWater=Integer.max(maxWater,height[end]*(end-start));
               end--;
            }
        }
        return maxWater;
    }
}