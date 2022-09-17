class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int[] freq=new int[101];
        for(int num:nums) freq[num]+=1;
        for(int i=1;i<101;i++){
            if(freq[i]==1) sum+=i;
        }
        return sum;
    }
}