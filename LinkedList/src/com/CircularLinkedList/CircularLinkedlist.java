package com.CircularLinkedList;

public class CircularLinkedlist {
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }while(temp != head);
        }
        System.out.println(head.value);
    }

    public void delete(int val){
        Node temp = head;
        if(head.value == val){
            head = head.next;
            tail.next = head;
        }
        do{
            if(temp.next.value == val){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }while(temp != head);
    }

}
