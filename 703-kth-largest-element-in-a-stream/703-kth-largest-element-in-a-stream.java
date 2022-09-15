class KthLargest {
PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
  final int k;
    public KthLargest(int k, int[] nums) {
    this.k = k;
    // add the numbers in the min heap
    for (int i = 0; i < nums.length; i++)
      add(nums[i]);
    }
     public int add(int num) {
    // add the new number in the min heap
    minHeap.add(num);

    // if heap has more than 'k' numbers, remove one number
    if (minHeap.size() > this.k)
      minHeap.poll();

    // return the 'Kth largest number
    return minHeap.peek();
  }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */