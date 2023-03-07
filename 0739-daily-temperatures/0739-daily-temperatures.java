class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res=new int[temperatures.length];
        int[] stack=new int[temperatures.length];
        int top=-1;
        for(int i=0;i<temperatures.length;i++){
            while(top>-1&&temperatures[i]>temperatures[stack[top]]){
                int idx=stack[top--];
                res[idx]=i-idx;
            }
            stack[++top]=i;
        }
        return res;
    }
    // public int[] dailyTemperatures(int[] temperatures) {
    //     int[] res=new int[temperatures.length];
    //     Stack<Integer> stack=new Stack<>();
    //     for(int i=0;i<temperatures.length;i++){
    //         while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
    //             int idx=stack.pop();
    //             res[idx]=i-idx;
    //         }
    //         stack.push(i);
    //     }
    //     return res;
    // }
}