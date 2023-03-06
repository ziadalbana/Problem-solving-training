class MinStack {
        Stack<Integer> minStack;
        int min;
    public MinStack() {
        minStack=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(min>=val){
            minStack.add(min);
            min=val;
        }
         minStack.add(val);
    }
    
    public void pop() {
        if(min==minStack.pop()){
            min=minStack.pop();
        } 
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */