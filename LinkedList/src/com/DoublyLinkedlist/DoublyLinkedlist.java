package com.DoublyLinkedlist;

public class DoublyLinkedlist {
    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int val){
            this.value = val;
            this.next = null;
            this.prev = null;
        }
    }
    private Node head;
    private int size;

    public DoublyLinkedlist() {
        size = 0;
    }

    public void insertatfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;

        size += 1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " " + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node last(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            last = temp;
            temp = temp.next;
        }
        return last;
    }

    public void insertatlast(int val,Node last) {
        Node node = new Node(val);
        node.prev = last;
        node.next = null;
        if(last != null){
            last.next = node;
        }
        else{
            head = node;
        }
        last = node;
        size += 1;
    }

    public void insertatlast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;
        if(head == null){
            head = node;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        last = node;

        size += 1;
    }

    public void insert(int val,int num){
        Node node = new Node(val);
        Node current = head;

         while(current != null){
             if(current.value == num){
                 node.next = current.next;
                 node.prev = current;

                 if(current.next != null){
                     current.next.prev = node;
                 }
                 current.next = node;
             }
             current = current.next;
         }
    }

}
