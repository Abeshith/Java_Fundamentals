package com.Generics;

import java.util.Arrays;
import java.util.List;

//will only able to pass Number and its subclasses
public class WildcardGenericArrayList<T extends Number> {
    private Object[] data;
    private static int DEFALT_SIZE = 10;
    private int size = 0;

    public WildcardGenericArrayList() {
        data = new Object[DEFALT_SIZE];
    }

    public void getlist(List<? extends Number> list){
        //do something
        //--->List<Number> list
        // it will pass only the list with type number and not its subclass

        //List<? extends Number>
        // use this to pass the subclass
    }


    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
    }
    public T remove(){
       T removed = (T)(data[--size]);
       return removed;
    }
    public int size(){
        return size;
    }
    public T get(int index){
        return (T)data[index];
    }

    public void set(int index, T num){
        data[index] = num;
        size++;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildcardGenericArrayList<Integer> list = new WildcardGenericArrayList<>();
        list.add(1);
        list.add(2);

        //list.add("fuf"); will give an error
        list.set(2, 3);
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.remove());
        System.out.println(list);
    }
}
