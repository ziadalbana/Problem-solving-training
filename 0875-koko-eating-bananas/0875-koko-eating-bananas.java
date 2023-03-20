class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=(int)Arrays.stream(piles).max().getAsInt();
        while(l<=r){
            int mid=l+(r-l)/2;
            long total=0;
            for(int pile:piles){
                total+=(pile+mid-1)/mid;
            }
            if(total>h) l=mid+1;
            else r=mid-1;
        }
        return l;
    }
}