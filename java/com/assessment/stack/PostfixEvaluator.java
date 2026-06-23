package com.assessment.stack;

import java.util.Stack;

/**
 * PROBLEM SET 5: Postfix (Reverse Polish Notation) Evaluator
 *
 * Evaluate a mathematical expression written in postfix notation.
 * In postfix notation, operators come AFTER their operands.
 *
 * The input is a space-separated string of tokens.
 * Supported operators: +  -  *  /
 * Operands are integers (may be negative).
 *
 * Examples:
 *  "3 4 +"        -> 7       (3 + 4)
 *  "5 1 2 + 4 * + 3 -"  -> 14   (5 + ((1+2)*4) - 3)
 *  "2 3 * 4 +"    -> 10      (2*3 + 4)
 *  "10 2 /"       -> 5       (10 / 2)
 *  "6 2 - 3 *"    -> 12      ((6-2)*3)
 *
 * Constraints:
 *  - Throw IllegalArgumentException for null/empty input
 *  - Throw IllegalArgumentException for unknown operators or malformed expressions
 *  - Integer division (e.g. 7 / 2 = 3)
 *
 * Algorithm hint:
 *  1. Split the expression by spaces
 *  2. For each token:
 *     - If it's a number → push it
 *     - If it's an operator → pop two operands, apply operator, push result
 *  3. The final answer is the only value left on the stack
 *
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
        return 0;
    }
}
