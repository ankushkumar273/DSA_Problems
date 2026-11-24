class MinStack {
    Stack<int[]> s;
    public MinStack() {
         s = new Stack<>();
    }
    
    public void push(int value) {
        if(s.isEmpty()){
            s.push(new int[]{value , value});
        }else{
            int minVal = Math.min(value, s.peek()[1]);
            s.push(new int[]{value, minVal});
        }
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek()[0];
    }
    
    public int getMin() {
        return s.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */