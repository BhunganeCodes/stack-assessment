package com.assessment.stack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * PROBLEM SET 4: Min Stack
 *
 * Design a stack that, in addition to normal push and pop operations,
 * can return the MINIMUM element in O(1) time (constant time — no loops allowed).
 *
 * Methods to implement:
 *  - push(int value)  : Push a value onto the stack
 *  - pop()            : Remove and return the top value
 *  - peek()           : Return the top value without removing it
 *  - getMin()         : Return the current minimum value in the stack
 *  - isEmpty()        : Return true if the stack is empty
 *
 * Constraints:
 *  - getMin(), pop(), and peek() must throw EmptyStackException when empty
 *  - getMin() MUST run in O(1) — no iteration over the stack
 *
 * Hint: Use a second "helper" stack that tracks minimums alongside the main stack.
 *
 * Run MinStackTest to check your work.
 */
public class MinStack {

    // TODO: declare your data structures
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<Integer>();
        this.minStack = new Stack<Integer>();
    }

    /** Push a value onto the stack. */
    public void push(int value) {
        // TODO
    }

    /** Remove and return the top value. Throws EmptyStackException if empty. */
    public int pop() {
        // TODO
        return 0;
    }

    /** Return the top value without removing it. Throws EmptyStackException if empty. */
    public int peek() {
        // TODO
        if (stack.isEmpty()) throw new EmptyStackException();
        return stack.peek();
    }

    /**
     * Return the minimum value currently in the stack in O(1) time.
     * Throws EmptyStackException if empty.
     */
    public int getMin() {
        // TODO
        if (minStack.isEmpty()) throw new EmptyStackException();
        return minStack.peek();
    }

    /** Return true if the stack is empty. */
    public boolean isEmpty() {
        // TODO
        return stack.isEmpty();
    }
}
