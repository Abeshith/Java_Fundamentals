package com.Linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        list.insertfirst(10);
        list.insertfirst(20);
        list.insertfirst(30);
        list.insertfirst(40);
        list.insert(35,3);
        list.insertrecusrsion(60,3);

        list.display();
        System.out.println(list.deletefirst());
        list.display();
        System.out.println(list.deletelast());
        list.display();
        System.out.println(list.delete(1));
        list.display();
        System.out.println(list.search(35));




        // using inbuild method
//        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
//        linkedlist.add(10);
//        linkedlist.add(20);
//        linkedlist.add(30);
//        linkedlist.add(40);
//
//        System.out.println(linkedlist);
//        System.out.println((linkedlist.get(3)));

    }
}