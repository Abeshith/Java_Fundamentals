package com.Stack;

public class CircularQueue {
    protected int[] data;

    private static final int DEFAULT_CAPACITY = 10;

    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    public CircularQueue() {
        data = new int[DEFAULT_CAPACITY];
    }
    public CircularQueue(int capacity) {
        data = new int[capacity];
    }
    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;

        end = end % data.length;
        size++;
        return true;
    }
    public int remove(){
        if(isEmpty()){
            return -1;
        }
        int removed = data[front];
        front++;
        size--;
        front = front % data.length;
        return removed;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return data[front];
    }
    public void display(){
        int count = 0;
        int i = front;
        while (count < size) {
            System.out.print(data[i] + "- > ");
            i = (i + 1) % data.length; // Move to the next index, wrapping around if needed
            count++;
        }
        System.out.println();
    }


}
