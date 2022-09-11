class Solution {
class Point {
  int x;
  int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int distFromOrigin() {
    // ignoring sqrt
    return (x * x) + (y * y);
  }
}
    public int[][] kClosest(int[][] points, int k) {
    PriorityQueue<Point> minHeap=new PriorityQueue<>((a1,a2)->a2.distFromOrigin() -a1.distFromOrigin());
    for(int i=0;i<k;i++) minHeap.add(new Point(points[i][0],points[i][1]));
    for(int i=k;i<points.length;i++){
        Point temp=new Point(points[i][0],points[i][1]);
      if(temp.distFromOrigin()<minHeap.peek().distFromOrigin()){
        minHeap.poll();
        minHeap.add(temp);
      }
    }
    int[][] res=new int[k][2];
    for(int i=0;i<k;i++){
        Point temp=minHeap.poll();
        res[i]=new int[]{temp.x,temp.y};
    } 
    return res;
  }
    
}