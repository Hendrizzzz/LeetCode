class MyStack {
    ArrayDeque<Integer> array = new ArrayDeque<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        array.push(x);
    }
    
    public int pop() {
        return array.pop();
    }
    
    public int top() {
        return array.peek();
    }
    
    public boolean empty() {
        return array.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */