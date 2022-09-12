class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    int[] topNumbers = new int[k];
    // TODO: Write your code here
    HashMap<Integer,Integer> freqMap=new HashMap<>();
    for(int n:nums) freqMap.put(n,freqMap.getOrDefault(n,0)+1);
    PriorityQueue<Map.Entry<Integer, Integer>> maxHeap=new PriorityQueue<>((a1,a2)->a2.getValue()-a1.getValue());
    for(Map.Entry<Integer, Integer> entry:freqMap.entrySet()) maxHeap.add(entry);
    for(int i=0;i<k;i++){
      topNumbers[i]=maxHeap.poll().getKey();
    } 
    return topNumbers;
    }
//         HashMap<Integer,Integer> map=new HashMap<>();
//         PriorityQueue<node> sortedmap=new PriorityQueue<>();
//         for (int i = 0; i < nums.length; i++) {
//             if (map.containsKey(nums[i])) map.put(nums[i],map.get(nums[i])+1);
//             else map.put(nums[i],1);
//         }
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//              sortedmap.add(new node(entry.getKey(),entry.getValue()));
//         }
//         int[] result=new int[k];
//         for (int i = 0; i < k; i++) {
//             result[i]=sortedmap.poll().key;
//         }
//        return  result;
//     }
//     class node implements Comparable<node> {
//         int key;
//         int value;
//         node(int key,int value){
//             this.key=key;
//             this.value=value;
//         }

//         @Override
//         public int compareTo(node o) {
//             return o.value-this.value;
//         }
//     }
}