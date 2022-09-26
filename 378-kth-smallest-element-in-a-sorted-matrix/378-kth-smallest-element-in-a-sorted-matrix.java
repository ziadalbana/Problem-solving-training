class Solution {
    //version 1
 //    public int kthSmallest(int[][] lists, int k) {
 //    int m=lists[0].length;
 //    PriorityQueue<node> minHeap=new  PriorityQueue<>((a1,a2)->a1.val-a2.val);
 //    for(int i=0;i<lists.length;i++) minHeap.add(new node (lists[i][0],i,0));
 //    int count=0;
 //    while(count<k){
 //      node min=minHeap.poll();
 //      count++;
 //      if(count==k) return min.val;
 //      if(min.index<m-1) minHeap.add(new node(lists[min.rowIdx][min.index+1],min.rowIdx,min.index+1));
 //    }
 //    return -1;
 //    }
 // class node {
 //    int val;
 //    int index;
 //    int rowIdx;
 //    public node (int val,int rowIdx,int index){
 //        this.val=val;
 //        this.rowIdx=rowIdx;
 //        this.index=index;
 //    }
 //  }
 // version 2
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
    int start = matrix[0][0], end = matrix[n - 1][n - 1];
    while (start < end) {
      int mid = start + (end - start) / 2;
      // first number is the smallest and the second number is the largest
      int[] smallLargePair = { matrix[0][0], matrix[n - 1][n - 1] };

      int count = countLessEqual(matrix, mid, smallLargePair);

      if (count == k)
        return smallLargePair[0];

      if (count < k)
        start = smallLargePair[1]; // search higher
      else
        end = smallLargePair[0]; // search lower
    }
 
    return start;
    }
     private int countLessEqual(int[][] matrix, int mid, int[] smallLargePair) {
    int count = 0;
    int n = matrix.length, row = n - 1, col = 0;
    while (row >= 0 && col < n) {
      if (matrix[row][col] > mid) {
        // as matrix[row][col] is bigger than the mid, let's keep track of the
        // smallest number greater than the mid
        smallLargePair[1] = Math.min(smallLargePair[1], matrix[row][col]);
        row--;
      } else {
        // as matrix[row][col] is less than or equal to the mid, let's keep track of the
        // biggest number less than or equal to the mid
        smallLargePair[0] = Math.max(smallLargePair[0], matrix[row][col]);
        count += row + 1;
        col++;
      }
    }
    return count;
  }
}