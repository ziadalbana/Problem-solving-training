class Solution {
    public int longestConsecutive(int[] nums) {
        //1 2 3 4 100 200
        //0 0 1 2 3 4 5 6 7 8
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);
        int longest=0;
        for(int num:nums){
            if(!set.contains(num-1)){
              int currentStreak=1;
              int currentNum=num;
              while(set.contains(currentNum+1)){
                currentStreak++;
                currentNum++;
              }
             longest=Integer.max(currentStreak,longest);   
         }
        }
        return longest;
    }
}