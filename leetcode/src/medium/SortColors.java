package medium;

public class SortColors {
    public void sortColors(int[] nums) {
      int[] c=new int[3];
        for (int i = 0; i < nums.length; i++) {
            c[nums[i]]+=1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(c[0]>0){
                nums[i]=0;
                c[0]--;
            }else if(c[1]>0){
                nums[i]=1;
                c[1]--;
            }else{
                nums[i]=2;
                c[2]--;
            }
        }
    }
}
