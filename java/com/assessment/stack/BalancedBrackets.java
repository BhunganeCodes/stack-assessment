package com.assessment.stack;

import java.util.Stack;

/**
 * PROBLEM SET 2: Balanced Brackets Checker
 *
 * Given a string containing only the characters '(', ')', '{', '}', '[' and ']',
 * determine whether the brackets are balanced (correctly opened and closed).
 *
 * Rules:
 *  - Every opening bracket must have a corresponding closing bracket.
 *  - Brackets must be closed in the correct order.
 *
 * Examples:
 *  "()[]{}"   -> true
 *  "([{}])"   -> true
 *  "(]"       -> false
 *  "([)]"     -> false
 *  ""         -> true  (empty string is considered balanced)
 *  null       -> false
 *
 * Hint: A Stack is perfect for this — push opening brackets,
 *       and pop when you encounter a closing bracket to check for a match.
 *
 * Run BalancedBracketsTest to check your work.
 */
public class BalancedBrackets {

    /**
     * Returns true if all brackets in the input string are balanced.
     *
     * @param input the string to check
     * @return true if balanced, false otherwise
     */
    public boolean isBalanced(String input) {
        // TODO
        return false;
    }
}
