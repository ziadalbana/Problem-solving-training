class Solution {
    public int findKthPositive(int[] nums, int k) {
        List<Integer> missingNumbers = new ArrayList<>();
        // TODO: Write your code here
        int i=0;
        while(i<nums.length){
            int j=nums[i];
            if(j>0&&j<=nums.length&&nums[i]!=nums[j-1]) swap(nums,i,j-1);
            else i++;
        }
        HashSet<Integer> set=new HashSet<>();
        for(i=0;i<nums.length;i++){
            if(missingNumbers.size()>=k) break;
            if(nums[i]!=i+1) {
                missingNumbers.add(i+1);
                set.add(nums[i]);
            }
        }
        for (int j = 1; missingNumbers.size()<k; j++) {
            int num= j+ nums.length;
            if(!set.contains(num)) missingNumbers.add(num);  
        }
        return missingNumbers.get(k-1);
    }
    private static void swap(int[] nums,int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}