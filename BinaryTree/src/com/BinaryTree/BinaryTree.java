package com.BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    private Node root;

    public BinaryTree() {

    }

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public void populate(Scanner sc) {
        System.out.println("Enter the root node val: ");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc,root);
    }
    public void populate(Scanner sc, Node node) {
        System.out.println("Do you want insert at left of: " + node.data);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the left node val: " + node.data);
            node.left = new Node(sc.nextInt());
            populate(sc,node.left);
        }
        System.out.println("Do you want insert at right of: " + node.data);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the right node val: " + node.data);
            node.right = new Node(sc.nextInt());
            populate(sc,node.right);
        }
    }
    public void display() {
        System.out.println("Inorder Traversal of the Binary Tree:");
        inorderTraversal(root);
    }

    private void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }
    private void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }
    public void postOrderTraversal() {
        postOrderTraversal(root);
    }
    private void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }
    public void InorderTraversal() {
        inorderTraversal(root);
    }
}
