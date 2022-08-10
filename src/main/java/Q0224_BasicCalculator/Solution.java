package Q0224_BasicCalculator;

import java.util.Stack;

class Solution {
    // A mono-stack to store operators, where priority of operators is from high to low.
    private final Stack<Character> operatorMonoStack = new Stack<>();
    // A stack to store operands.
    private final Stack<Integer> numberStack = new Stack<>();

    public int calculate(String s) {
        // To prevent the first number is negative.
        numberStack.push(0);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case ' ':
                    continue;
                case '(':
                    operatorMonoStack.push('(');
                    break;
                case ')':
                    // Calculate top elements in both stacks in the current level
                    while (!operatorMonoStack.empty() && operatorMonoStack.peek() != '(') {
                        calcInStacks();
                    }
                    // If our calculation performed inside a pair of parentheses,
                    // remove '(' as we've done the calculation of this level.
                    if (!operatorMonoStack.empty() && operatorMonoStack.peek() == '(') {
                        operatorMonoStack.pop();
                    }
                    break;
                case '+', '-':
                    // Convert "(-" to "(0-", and "(+" to "(0+"
                    if (i > 0 && s.charAt(i - 1) == '(') {
                        numberStack.push(0);
                    }

                    // When there is a new operator to be added to the stack,
                    // first calculate top elements in both stacks,
                    // until the top operator is '(',
                    // as we probably pushed '(' before, and it's not a binary operation.
                    while (!operatorMonoStack.empty() && operatorMonoStack.peek() != '(') {
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

        // calc & push the result back to the operand stack.
        numberStack.push(op == '+' ? operand1 + operand2 : operand1 - operand2);
    }
}
