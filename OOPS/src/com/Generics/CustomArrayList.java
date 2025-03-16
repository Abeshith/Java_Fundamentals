package com.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFALT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        data = new int[DEFALT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
    }
    public int remove(){
       int removed = data[--size];
       return removed;
    }
    public int size(){
        return size;
    }
    public int get(int index){
        return data[index];
    }

    public void set(int index, int num){
        data[index] = num;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);

        System.out.println(list);
        list.size();
    }
}
