package Q0150_EvaluateReversePolishNotation;

import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            try {
                stack.push(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                Integer op2 = stack.pop();
                Integer op1 = stack.pop();
                switch (s) {
                    case "+":
                        stack.push(op1 + op2);
                        break;
                    case "-":
                        stack.push(op1 - op2);
                        break;
                    case "*":
                        stack.push(op1 * op2);
                        break;
                    case "/":
                        stack.push(op1 / op2);
                        break;
                }
            }
        }
        return stack.pop();
    }
}