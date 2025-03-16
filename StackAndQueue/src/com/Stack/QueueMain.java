package com.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();
        Queue<Integer> queue1 = new LinkedList<>();
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);

        queue.display();
        System.out.println(queue.front());

        queue.remove();
        queue.display();
        queue.remove();
        queue.remove();
        queue.remove();




    }
}
