package com.Linkedlist;

import java.util.LinkedList;
import com.Linkedlist.Linkedlist;

public class Questions {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insertfirst(40);
        list.insertfirst(40);
        list.insertfirst(30);
        list.insertfirst(20);
        list.insertfirst(10);
        list.insertfirst(10);
        list.insertfirst(10);
        list.display();

        list.removeDuplicates();
        list.display();

        Linkedlist list1 = new Linkedlist();
        list1.insertlast(1);
        list1.insertlast(3);
        list1.insertlast(5);

        Linkedlist list2 = new Linkedlist();
        list2.insertlast(1);
        list2.insertlast(2);
        list2.insertlast(9);
        list2.insertlast(14);

        list1.display();
        list2.display();

        Linkedlist ans = Linkedlist.merge(list1,list2);
        ans.display();


        Linkedlist list3 = new Linkedlist();
        list3.insertlast(1);
        list3.insertlast(2);
        list3.insertlast(3);
        list3.insertlast(4);
        list3.insertlast(5);
        list3.display();

    }
}
