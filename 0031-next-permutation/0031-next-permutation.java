class Solution {
    public  void nextPermutation(int[] nums) {
        // step 1 find idx
        List<Integer> temp=copyToList(nums);
        int n=nums.length;
        int idx=-1;
        for(int i=n-2;i>=0;i--){
            if(temp.get(i)<temp.get(i+1)){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            Collections.reverse(temp);
            copy(temp,nums);
            return;
        }
        // step 2 find the just greater than idx
        for(int i=n-1;i>idx;i--){
            if(temp.get(i)>temp.get(idx)){
                int t=temp.get(i);
                temp.set(i,temp.get(idx));
                temp.set(idx,t);
                break;
            }
        }
        List<Integer> subList =temp.subList(idx+1,n);
        Collections.reverse(subList);
        copy(temp,nums);
    }
    private  List<Integer> copyToList(int[] nums){
        List<Integer> list=new ArrayList<>();
        for(int n:nums) list.add(n);
        return list;
    }
    private  void copy( List<Integer> temp,int[] nums){
        for(int i=0;i<nums.length;i++)
            nums[i]=temp.get(i);
    }
}