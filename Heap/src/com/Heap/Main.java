package com.Heap;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(30);
        heap.insert(2);

        System.out.println(heap.remove());
        ArrayList<Integer> list = heap.heapsort();
        System.out.println(list);
    }

}