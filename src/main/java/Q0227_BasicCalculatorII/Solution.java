package Q0227_BasicCalculatorII;

import java.util.Stack;

class Solution {
    // A mono-stack to store operators, where priority of operators is from high to low.
    private final Stack<Character> operatorMonoStack = new Stack<>();
    // A stack to store operands.
    private final Stack<Integer> numberStack = new Stack<>();

    public int calculate(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case ' ':
                    continue;
                case '+', '-', '*', '/':
                    // When there is a new operator to be added to the stack,
                    // first calculate top elements in both stacks,
                    // until the current operator has a higher priority than the operator at the top of stack,
                    // as we use a monotonous stack to store operators.
                    Integer curOpPriority = getOpPriority(ch);
                    while (!operatorMonoStack.empty() && curOpPriority <= getOpPriority(operatorMonoStack.peek())) {
                        calcInStacks();
                    }
                    operatorMonoStack.push(ch);
                    break;
                default: // 0 - 9
                    // Get the intact number from the string,
                    // then push it to operand stack
                    int j, num = 0;
                    for (j = i; j < s.length() && Character.isDigit(s.charAt(j)); j++) {
                        num = num * 10 + s.charAt(j) - '0';
                    }
                    i = j - 1;
                    numberStack.push(num);
            }
        }
        // To calculate the remaining operands with operators in the stack.
        while (!operatorMonoStack.isEmpty()) calcInStacks();
        return numberStack.peek();
    }

    /**
     * Get the priority of given operator.
     *
     * @param op The operator to check the priority of.
     * @return The operator's priority.
     */
    private Integer getOpPriority(Character op) {
        return switch (op) {
            case '+', '-' -> 0;
            default -> 1; // '*', '/'
        };
    }

    /**
     * If there are at least two operands and one operator in the stacks,
     * pop the two operands and the operator, calculate the result,
     * and push the result back to the operand stack.
     */
    private void calcInStacks() {
        if (numberStack.size() < 2 || operatorMonoStack.empty()) return;

        // get operands in order and operator
        Integer operand2 = numberStack.pop();
        Integer operand1 = numberStack.pop();
        Character op = operatorMonoStack.pop();

        // calc
        Integer result = switch (op) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            default -> operand1 / operand2; // '/'
        };

        // Push the result back to the operand stack.
        numberStack.push(result);
    }
}