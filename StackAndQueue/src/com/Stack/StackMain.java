package com.Stack;

import java.util.Arrays;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
