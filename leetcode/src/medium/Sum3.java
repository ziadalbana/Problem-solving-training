package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {
        Sum3 s=new Sum3();
        s.threeSum(new int[]{-1,0,1,2,-1,-4});
    }
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length<3) return new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        int n= nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            int l = i + 1;
            int u = n - 1;
            while (l < u) {
                if (nums[i] + nums[l] + nums[u] == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[u]);
                    result.add(temp);
                    while (l + 1 < u && nums[l + 1] == nums[l]) l++;
                    while (u - 1 > l && nums[u - 1] == nums[u]) u--;
                    l++;
                    u--;
                } else if (nums[i] + nums[l] < -nums[u]) l++;
                else u--;
            }
            while (i + 1 < n && nums[i + 1] == nums[i]) i++;
        }
        return result;

    }



}
