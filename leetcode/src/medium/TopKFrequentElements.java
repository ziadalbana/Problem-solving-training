package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        TopKFrequentElements n=new TopKFrequentElements();
        n.topKFrequent(new int[]{1,1,1,2,2,3},2);
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<node> sortedmap=new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) map.put(nums[i],map.get(nums[i])+1);
            else map.put(nums[i],1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
             sortedmap.add(new node(entry.getKey(),entry.getValue()));
        }
        int[] result=new int[k];
        for (int i = 0; i < k; i++) {
            result[i]=sortedmap.poll().key;
        }
       return  result;
    }
    class node implements Comparable<node> {
        int key;
        int value;
        node(int key,int value){
            this.key=key;
            this.value=value;
        }

        @Override
        public int compareTo(node o) {
            return o.value-this.value;
        }
    }
}
