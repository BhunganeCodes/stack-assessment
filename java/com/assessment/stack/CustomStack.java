package com.assessment.stack;

/**
 * PROBLEM SET 1: Build Your Own Stack
 *
 * Your task is to implement a generic stack from scratch using an array internally.
 * A Stack follows LIFO (Last In, First Out) ordering.
 *
 * You must NOT use java.util.Stack, java.util.Deque, or any other
 * collection class. Only a plain array is allowed as the backing store.
 *
 * Methods to implement:
 *  - push(T item)   : Add an item to the top of the stack
 *  - pop()          : Remove and return the top item
 *  - peek()         : Return the top item without removing it
 *  - isEmpty()      : Return true if the stack has no elements
 *  - size()         : Return the number of elements in the stack
 *
 * Constraints:
 *  - The stack must grow dynamically (double capacity when full)
 *  - pop() and peek() on an empty stack must throw EmptyStackException
 *
 * Run CustomStackTest to check your work.
 */
public class CustomStack<T> {

    // TODO: declare your backing array and any fields you need (size, capacity, etc.)

    public CustomStack() {
        // TODO: initialise your array with a starting capacity (e.g. 4)
    }

    /** Push an item onto the top of the stack. */
    public void push(T item) {
        // TODO
    }

    /** Remove and return the top item. Throws EmptyStackException if empty. */
    public T pop() {
        // TODO
        return null;
    }

    /** Return the top item without removing it. Throws EmptyStackException if empty. */
    public T peek() {
        // TODO
        return null;
    }

    /** Return true if the stack contains no elements. */
    public boolean isEmpty() {
        // TODO
        return true;
    }

    /** Return the number of elements currently in the stack. */
    public int size() {
        // TODO
        return 0;
    }
}
