package medium;

public class JumpGame {
    public static void main(String[] args) {
        int[] temp=new int[]{2,3,1,1,4};
        JumpGame n=new JumpGame();
        System.out.println(n.canJump(temp));
    }
    public boolean canJump(int[] nums) {
       boolean status=false;
       if (nums.length==1) return true;
       int target=nums.length-1;
        for (int i = nums.length-2; i >=0; i--) {
            if (target-nums[i]<=0) {
                target=i;
                status=true;
            }
            else status =false;
        }
        return status;
    }
}
