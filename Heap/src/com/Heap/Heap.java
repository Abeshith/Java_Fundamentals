package com.Heap;

import java.util.ArrayList;

public class Heap <T extends Comparable<T>>{
    private ArrayList<T> heap;

    public Heap(){
        heap = new ArrayList<>();
    }

    private void swap(int start, int end){
        T temp = heap.get(start);
        heap.set(start, heap.get(end));
        heap.set(end, temp);
    }
    private int parent(int index){
        return (index - 1)/2;
    }
    private int leftChild(int index){
        return index * 2 + 1;
    }
    private int rightChild(int index){
        return index * 2 + 2;
    }
    public void insert(T val){
        heap.add(val);
        upheap(heap.size() - 1);
    }
    private void upheap(int index){
        if(index == 0) return;

        int p = parent(index);
        if(heap.get(index).compareTo(heap.get(p)) < 0){
            swap(index, p);
            upheap(p);
        }
    }
    public T remove() throws Exception{
        if(heap.isEmpty()) throw new Exception("Heap is empty");

        T temp = heap.get(0);
        T last = heap.remove(heap.size() - 1);
        if(!heap.isEmpty()){
            heap.set(0, last);
            downheap(0);
        }
        return temp;
    }
    private void downheap(int index){
        int min = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if(left < heap.size() && heap.get(left).compareTo(heap.get(min)) < 0){
            min = left;
        }
        if(right < heap.size() && heap.get(right).compareTo(heap.get(min)) < 0){
            min = right;
        }
        if(min != index){
            swap(min, index);
            downheap(index);
        }
    }
    public ArrayList<T> heapsort(){
        if(heap.isEmpty()) return new ArrayList<>();
         ArrayList<T> temp = new ArrayList<>();
         while(!heap.isEmpty()){
             temp.add(heap.remove(0));
         }
         return temp;
    }
}
