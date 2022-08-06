package Q0232_ImplementQueueusingStacks;

import java.util.Stack;

class MyQueue {

    private final Stack<Integer> in;
    private final Stack<Integer> out;

    public MyQueue() {
        this.in = new Stack<>();
        this.out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.empty()) {
            move();
        }
        return out.pop();
    }

    public int peek() {
        if (out.empty()) {
            move();
        }
        return out.peek();
    }

    public boolean empty() {
        return in.empty() && out.empty();
    }

    private void move() {
        while (!in.empty()) {
            out.push(in.pop());
        }
    }
}
