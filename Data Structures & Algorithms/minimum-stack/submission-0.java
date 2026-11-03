class MinStack {
    Stack<Integer> stack, minStack;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        stack = new Stack();
        minStack = new Stack();
    }
    
    public void push(int val) {
        stack.push(val);
        int min = val;
        if(!minStack.isEmpty() && min > minStack.peek()){
            min = minStack.peek();
        }
        minStack.push(min);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
