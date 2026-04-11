// Last updated: 4/11/2026, 12:50:55 PM
class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty()){
            minstack.push(val);
        }else{
            if(val <= minstack.peek()){
                minstack.push(val);
            }
        }
    }
    
    public void pop() {
        int removed = stack.pop();
        if(removed == minstack.peek()){
            minstack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
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