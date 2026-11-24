import java.util.Stack;
class MinStack {

private Stack<Integer> stack1;
private Stack<Integer> stack2;
    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int value) {
        stack1.push(value);
        if(stack2.isEmpty() || value<=stack2.peek())
        {
            stack2.push(value);
        }
    }
    
    public void pop() {
        int t=stack1.pop();
        if(t==stack2.peek()) stack2.pop();
    }
    
    public int top() {
         return stack1.peek();
    }
    
    public int getMin() {
        return stack2.peek();
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