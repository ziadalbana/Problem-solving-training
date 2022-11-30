class Solution {
    public int maxArea(int[] height) {
        int start=0,end=height.length-1;
        int maxWater=Integer.MIN_VALUE;
        while(start<end){
            int h=Integer.min(height[start],height[end]);
            maxWater=Integer.max(maxWater,h*(end-start));
            if(height[start]<height[end]) start++;
            else end--;
        }
        return maxWater;
    }
}