package com.Stack;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_CAPACITY = 10;

    int ptr = 0;

    CustomQueue() {
        data = new int[DEFAULT_CAPACITY];
    }
    CustomQueue(int capacity) {
        this.data = new int[capacity];
    }

    public void insert(int val) throws Exception{
        if(ptr == data.length){
            throw new Exception("Queue is Full");
        }
        data[ptr++] = val;
    }

    public int remove() throws Exception{
        if(ptr == 0){
            throw new Exception("Queue is Empty");
        }
        int removed  = data[0];

        for(int i=1; i<ptr; i++){
            data[i-1] = data[i];
        }
        ptr--;
        return removed;
    }
    public int front() throws Exception{
        if(ptr == 0){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }
    public void display(){
        for(int i=0; i<ptr; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
