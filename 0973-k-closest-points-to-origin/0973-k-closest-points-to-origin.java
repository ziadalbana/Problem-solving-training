class Solution {
    class Point {
        int [] pos;
        public Point(int[] pos){
            this.pos=pos;
        }
        public int getDistance(){
            return (pos[0]*pos[0])+(pos[1]*pos[1]);
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> queue=new  PriorityQueue<>((a1,a2)->a2.getDistance()-a1.getDistance());
        for(int i=0;i<k;i++) queue.add(new Point(points[i]));
        for(int i=k;i<points.length;i++){
            Point temp=new Point(points[i]); 
            if(queue.peek().getDistance()>temp.getDistance()){
                queue.poll();
                queue.add(temp);
            }
        }
        int[][] res =new int[k][2];
        for(int i=0;i<k;i++){
            res[i]=queue.poll().pos;
        }
        return res;
        
    }
}