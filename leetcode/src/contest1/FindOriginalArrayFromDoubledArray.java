package contest1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class FindOriginalArrayFromDoubledArray {
    public static void main(String[] args) {
       findOriginalArray(new int[]{6,3,0,1});
    }
    public static int[] findOriginalArray(int[] changed) {
        int size=changed.length;
        if (size%2 !=0) return new int[]{};
        int mid=size/2;
        int[] result=new int[mid];
        int j=0;
        HashMap<Integer,Integer> elements=new HashMap<>();
        for (int i = 0; i <size ; i++) {
            if(elements.containsKey(changed[i])){
                elements.replace(changed[i],elements.get(changed[i])+1);
            }else {
            elements.put(changed[i],1);
            }
        }
        for (int i=0;i<size;i++) {
            if (elements.containsKey(changed[i]*2))
            {
                if (changed[i]==0&&elements.get(changed[i])%2==0) {
                    elements.replace(changed[i] * 2, elements.get(changed[i] * 2) - 2);
                    result[j] = changed[i];
                    j++;
                }
                else if(changed[i]!=0&&elements.get(changed[i]*2)>0) {
                    elements.replace(changed[i] * 2, elements.get(changed[i] * 2) - 1);
                    result[j] = changed[i];
                    j++;
                }
            }
            if(j>=mid) return result;
        }
        if(j<mid) return new int[] {};
        return result;
    }
}
