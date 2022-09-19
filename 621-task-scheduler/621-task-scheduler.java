class Solution {
    public int leastInterval(char[] tasks, int n) {
    HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap=new PriorityQueue<>((a1,a2)->a2.getValue()-a1.getValue());
        for(char c:tasks) map.put(c,map.getOrDefault(c,0)+1);
        maxHeap.addAll(map.entrySet());
        int count=0;
        while(!maxHeap.isEmpty()){
            List<Map.Entry<Character, Integer>> waitingList=new LinkedList<>();
            int k = n+1;
            for (; k >0&&!maxHeap.isEmpty() ; k--) {
                Map.Entry<Character, Integer> curr=maxHeap.poll();
                count++;
                curr.setValue(curr.getValue()-1);
                if(curr.getValue()>0) waitingList.add(curr);
            }
            maxHeap.addAll(waitingList);
            if(!maxHeap.isEmpty()){
                count+=k;
            }
        }
        return count;
    }
}