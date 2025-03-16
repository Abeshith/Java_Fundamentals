package com.Stack;

public class CircularMain {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.display();

        System.out.println(queue.remove());
        queue.display();
        queue.insert(6);
        queue.display();

        System.out.println(queue.remove());
        queue.display();
        queue.insert(7);
        queue.display();

    }
}
