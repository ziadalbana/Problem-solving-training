class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        for(int n:candies) max=Integer.max(max,n);
        List<Boolean> res=new ArrayList<>();
        for(int n:candies){
            if(n+extraCandies>=max) res.add(true);
            else res.add(false);
        }
        return res;
    }
}