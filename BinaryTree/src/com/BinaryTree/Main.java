package com.BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        tree.populate(new Scanner(System.in));
//        tree.display();

        BinarySearchTree treee = new BinarySearchTree();
        int[] nums = {5,3,8,9,2,10,1,34};
        treee.populate(nums);
//        treee.insert(10);
//        treee.insert(20);
//        treee.insert(30);
//        treee.insert(5);
//        treee.insert(7);
//        treee.insert(4);

        treee.display();
    }
}