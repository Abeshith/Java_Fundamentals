package com.Linkedlist;

import com.DoublyLinkedlist.DoublyLinkedlist;

public class Linkedlist {

    public class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;

    private int size;
    public Linkedlist() {
        size = 0;
    }

    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size += 1;
    }
    public void insertlast(int val) {
        if(tail == null){
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size += 1;
    }

    public void insert(int val,int pos){
        if(pos == 0){
            insertfirst(val);
            return;
        }
        if(pos == size){
            insertlast(val);
            return;
        }
        Node temp = head;
        for(int i = 0; i < pos - 1; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size += 1;
    }

    public Node insertrec(int val,int pos,Node temp){
        if(pos == 0){
            Node node = new Node(val,temp);
            size++;
            return node;
        }
        temp.next = insertrec(val,pos-1,temp.next);
        return temp;
    }

    public void insertrecusrsion(int val,int pos){
        head = insertrec(val,pos,head);
    }

    public void display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int deletefirst(){
        int val = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size -= 1;
        return val;
    }
    public int deletelast(){
        if(size <= 0){
            deletefirst();
        }
        Node secondlast = get(size - 2);
        int val = tail.val;
        tail = secondlast;
        tail.next = null;
        size -= 1;
        return val;
    }

    public int delete(int pos){
        if(pos == 0){
            return deletefirst();
        }
        if(pos == size - 1){
            return deletelast();
        }

        Node prev = get(pos - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;

        size -= 1;
        return val;
    }

    public Node get(int pos){
        Node node = head;
        for(int i = 0; i < pos; i++){
            node = node.next;
        }
        return node;
    }

    public Node search(int val){
        Node temp = head;
        while(temp != null){
            if(temp.val == val){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    //Questions

    public void removeDuplicates(){
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
                size--;
            } else {
                temp = temp.next;
            }
        }
        tail = temp;
        if (tail != null) {
            tail.next = null;
        }
    }

    public static Linkedlist merge(Linkedlist list1, Linkedlist list2){
        Node f = list1.head;
        Node s = list2.head;
        Linkedlist ans = new Linkedlist();
        while(f != null && s != null){
            if(f.val <= s.val){
                ans.insertlast(f.val);
                f = f.next;
            }
            else{
                ans.insertlast(s.val);
                s = s.next;
            }
        }
        if(f != null){
            ans.insertlast(f.val);
            f = f.next;
        }
        if(s != null){
            ans.insertlast(s.val);
            s = s.next;
        }
        return ans;
    }

    public void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }




}

