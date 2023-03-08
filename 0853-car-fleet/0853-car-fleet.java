class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack=new Stack<>();
        int[][] sorted=new int[speed.length][2];
        for(int i=0;i<speed.length;i++) sorted[i]=new int[]{position[i],speed[i]};
        Arrays.sort(sorted,(a,b)->a[0]-b[0]);
        for(int i=speed.length-1;i>=0;i--){
            double time=(double)(target-sorted[i][0])/sorted[i][1];
            if(stack.isEmpty()||time>stack.peek()) stack.push(time);
        }
        return stack.size();
    }
}