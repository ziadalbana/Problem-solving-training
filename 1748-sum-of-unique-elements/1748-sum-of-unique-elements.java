class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:nums) freq.put(num,freq.getOrDefault(num,0)+1);
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            if(entry.getValue()==1) sum+=entry.getKey();
        }
        return sum;
    }
}