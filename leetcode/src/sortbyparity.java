public class sortbyparity {
    public static void main(String[] args) {
        int[] nums=new int[]{4,2,5,7};
        nums=sortArrayByParityII(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
    //time complexity =O(n^2)
    //space complexity=O(1)
    public static int[] sortArrayByParityII(int[] nums) {
            for(int i=0;i<nums.length;i+=2){
                if(nums[i]%2!=0){
                    for(int y=1;y<nums.length;y+=2) {
                        if(nums[y]%2==0) {
                            int temp = nums[i];
                            nums[i] =nums[y];
                            nums[y]=temp;
                            break;
                        }        
                    }        
                }
            }
            return nums;
    }
    //time complexity =O(n)
    //space complexity=O(n)
    public static int[] sortArrayByParityIII(int[] nums) {
           int oddPointer=1;
           int evenPointer=0;
           int[] ans=new int[nums.length];
           for(int i=0;i<nums.length;i++){
               if(nums[i]%2!=0){
                   ans[oddPointer]=nums[i];
                   oddPointer+=2;
               }
               if(nums[i]%2==0){
                   ans[evenPointer]=nums[i];
                   evenPointer+=2;
               }
           }
           return ans;
    }
}
