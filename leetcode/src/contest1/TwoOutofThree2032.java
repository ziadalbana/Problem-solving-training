package contest1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TwoOutofThree2032 {
    public static void main(String[] args) {
     int [] num1=new int[]{7,2,3,8,7,14,11,7,6};
     int[] nums2=new int[]{3,8,14,14,4};
     int[] nums3=new int[]{14,7,11,8};
     twoOutOfThree(num1,nums2,nums3);
    }
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashMap<Integer,Integer> apperance=new HashMap<>();
        HashSet<Integer> result=new HashSet<>();
        int i;
        for (i = 0; i < nums1.length; i++) {
            apperance.put(nums1[i],1);
        }
        HashSet<Integer> taken=new HashSet<>();
        for (i = 0; i < nums2.length; i++) {
            if (apperance.containsKey(nums2[i])&&!taken.contains(nums2[i])){
                apperance.replace(nums2[i],apperance.get(nums2[i])+1);
            }else if(!apperance.containsKey(nums2[i])) {
                apperance.put(nums2[i],1);
            }
            taken.add(nums2[i]);
            if (apperance.get(nums2[i])==2){
                result.add(nums2[i]);
            }
        }
        taken=new HashSet<>();
        for (i = 0; i < nums3.length; i++) {
            if (apperance.containsKey(nums3[i])&&!taken.contains(nums3[i])){
                apperance.replace(nums3[i],apperance.get(nums3[i])+1);
            }else if(!apperance.containsKey(nums3[i])){
                apperance.put(nums3[i],1);
            }
            taken.add(nums3[i]);
            if (apperance.get(nums3[i])==2){
                result.add(nums3[i]);
            }
        }
        List<Integer> arr=new ArrayList<>();
        for (Integer n:result) {
            arr.add(n);
        }
        return arr;
    }
}
