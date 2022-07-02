class Solution {
    public int maxArea(int[] height) {
        int water=Integer.MIN_VALUE;
        int i=0;int j=height.length-1;
        while(i<j){
            water=Integer.max(water,(j-i)*Integer.min(height[i],height[j]));
            if(height[i]<height[j]) i++;
            else j--;
        }
        return water;
        
    }
}