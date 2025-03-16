package com.Stack;

import java.util.EmptyStackException;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_CAPACITY = 10;

    int ptr = -1;
    public CustomStack() {
        data = new int[DEFAULT_CAPACITY];
    }
    public CustomStack(int size) {
        data = new int[size];
    }

    public boolean push(int item) throws StackException{
        if(isFull()){
            throw new StackException("Stack is fll");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }
    public int pop() throws StackException {
        if(ptr == -1){
            throw new StackException("Stack is empty");
        }
        return data[ptr--];
    }

    public int peek() throws StackException{
        if(ptr == -1){
            throw new StackException("Stack is empty");
        }
        return  data[ptr];
    }
    @Override
    public String toString() {
        if (ptr == -1) {
            return "Stack is empty";
        }

        StringBuilder stackString = new StringBuilder("Stack contents: ");
        for (int i = 0; i <= ptr; i++) {
            stackString.append(data[i]);
            if (i < ptr) {
                stackString.append(", ");
            }
        }
        return stackString.toString();
    }
}
