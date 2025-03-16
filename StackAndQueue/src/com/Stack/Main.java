package com.Stack;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

//        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);


        Queue<Integer> queue = new LinkedList<>();
        queue.remove();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.peek();

        System.out.println(queue);
        System.out.println(queue.peek());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();

    }
}