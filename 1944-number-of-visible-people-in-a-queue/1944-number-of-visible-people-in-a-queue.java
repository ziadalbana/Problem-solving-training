class Solution {
    public int[] canSeePersonsCount(int[] heights) {
       Stack<Integer> stack=new Stack<>();
        int[] res =new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            int count=0;
            while(!stack.isEmpty()&&heights[i]>stack.peek()){
                count++;
                stack.pop();
            }
            if(!stack.isEmpty()) count++;
            res[i]=count;
            stack.push(heights[i]);
        }
        return res;
    }
}