package com.BinaryTree;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {

    }

    public class Node{
        int data;
        Node left;
        Node right;
        int height;

        public Node(int data) {
            this.data = data;
        }

        public int getValue(){
            return data;
        }
    }

    public int getHeight(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int data){
        root = insert(root,data);
    }
    private Node insert(Node node, int data) {
        if(node == null){
            node = new Node(data);
            return node;
        }
        if(data < node.data){
            node.left = insert(node.left, data);
        }
        if(data > node.data){
            node.right = insert(node.right, data);
        }
        node.height = Math.max(getHeight(node.left) , getHeight(node.right)) + 1;

        return node;
    }
    public void populate(int[] nums){
        for (int num : nums) {
            this.insert(num);
        }
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }


    public void display(){
        display(root , "Root Node:");
    }
    public void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.data);
        display(node.left , "Left child of " + node.data + " : ") ;
        display(node.right , "Right child of " + node.data + " : ") ;
    }




}

