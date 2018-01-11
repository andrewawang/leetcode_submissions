class MinStack {
    PriorityQueue<Integer> min;
    Stack _result;
    /** initialize your data structure here. */
    public MinStack() {
        min = new PriorityQueue<>();
        _result = new Stack();
    }
    
    public void push(int x) {
        min.add(x);
        _result.push(x);
    }
    
    public void pop() {
        min.remove(_result.pop());
    }
    
    public int top() {
        return (int) _result.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
