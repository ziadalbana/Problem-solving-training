class FreqStack {
  PriorityQueue<Entry> maxHeap;
  Map<Integer, Integer> freqMap;
  int sequenceNum;
    public FreqStack() {
     maxHeap=new PriorityQueue<>();
     freqMap = new HashMap<>();
     sequenceNum=0; 
    }
    public void push(int num) {
    sequenceNum++;
    freqMap.put(num,freqMap.getOrDefault(num,0)+1);
    maxHeap.add(new Entry(num,freqMap.get(num),sequenceNum));
    }
    
    public int pop() {
    Entry top=maxHeap.poll();
    if(top.freq>1){
      top.freq--;
      freqMap.put(top.key,top.freq);
    }
    else freqMap.remove(top.key);
    return top.key;
    }
    class Entry implements Comparable<Entry>{
    int key;
    int freq;
    int sequence;
    public Entry(int key,int freq,int sequence){
      this.key=key;
      this.freq=freq;
      this.sequence=sequence;
    }
    @Override
    public int compareTo(Entry o) {
      if(this.freq!=o.freq) return o.freq-this.freq;
      return o.sequence-this.sequence;
    }
  }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */