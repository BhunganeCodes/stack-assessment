package com.assessment.stack;

import java.util.Stack;

/**
 * PROBLEM SET 5: Postfix (Reverse Polish Notation) Evaluator
 * <p>
 * Evaluate a mathematical expression written in postfix notation.
 * In postfix notation, operators come AFTER their operands.
 * <p>
 * The input is a space-separated string of tokens.
 * Supported operators: +  -  *  /
 * Operands are integers (may be negative).
 * <p>
 * Examples:
 * "3 4 +"        -> 7       (3 + 4)
 * "5 1 2 + 4 * + 3 -"  -> 14   (5 + ((1+2)*4) - 3)
 * "2 3 * 4 +"    -> 10      (2*3 + 4)
 * "10 2 /"       -> 5       (10 / 2)
 * "6 2 - 3 *"    -> 12      ((6-2)*3)
 * <p>
 * Constraints:
 * - Throw IllegalArgumentException for null/empty input
 * - Throw IllegalArgumentException for unknown operators or malformed expressions
 * - Integer division (e.g. 7 / 2 = 3)
 * <p>
 * Algorithm hint:
 * 1. Split the expression by spaces
 * 2. For each token:
 * - If it's a number → push it
 * - If it's an operator → pop two operands, apply operator, push result
 * 3. The final answer is the only value left on the stack
 * <p>
 * Run PostfixEvaluatorTest to check your work.
 */
public class PostfixEvaluator {

    /**
     * Evaluate a postfix expression and return the integer result.
     *
     * @param expression space-separated postfix expression
     * @return the integer result
     * @throws IllegalArgumentException for invalid input
     */
    public int evaluate(String expression) {
        // TODO

        if (expression == null) throw new IllegalArgumentException();
        if (expression.trim().isEmpty()) throw new IllegalArgumentException();

        Stack<Integer> stack = new Stack<Integer>();

        String[] tokens = expression.split("\\s+");

        for (String token : tokens) {
            try {
                int value = Integer.parseInt(token);
                stack.push(value);
            } catch (NumberFormatException e) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException();
                }

                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;

                    case "-":
                        stack.push(a - b);
                        break;

                    case "*":
                        stack.push(a * b);
                        break;

                    case "/":
                        stack.push(a / b);
                        break;

                    default:
                        throw new IllegalArgumentException();
                }

            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException();
        }

        return stack.pop();
    }
}
