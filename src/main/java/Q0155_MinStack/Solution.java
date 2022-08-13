package Q0155_MinStack;

import java.util.Stack;

class MinStack {
    private final Stack<Integer> stack;
    private final Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val) {
        this.stack.push(val);
        if (this.minStack.empty() || val <= this.minStack.peek()) {
            this.minStack.push(val);
        }
    }

    public void pop() {
        int top = this.stack.pop();
        if (top == this.minStack.peek()) {
            this.minStack.pop();
        }
    }

    public int top() {
        return this.stack.peek();
    }

    public int getMin() {
        return this.minStack.peek();
    }
}