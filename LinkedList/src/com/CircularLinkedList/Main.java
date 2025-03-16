package com.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedlist cll = new CircularLinkedlist();

        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        cll.delete(10);
        cll.display();

    }
}
