package com.DoublyLinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedlist list = new DoublyLinkedlist();
        list.insertatfirst(10);
        list.insertatfirst(20);
        list.insertatfirst(30);
        list.insertatlast(5, list.last());
        list.insertatlast(3, list.last());
        list.insertatlast(4);
        list.insertatlast(2);


        list.display();

        list.insert(23,20);
        list.insert(0,2);
        list.display();
    }
}
