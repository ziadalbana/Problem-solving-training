class Solution {
    public int maxArea(int[] height) {
        int i=0;int j=height.length-1;
        int water=Integer.MIN_VALUE;
        while(i<j){
            water=Integer.max(water,(j-i)*Integer.min(height[i],height[j]));
            if(height[i]<height[j]) i++;
            else j--;
        }
        return water;
        
    }
}