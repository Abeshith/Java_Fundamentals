package com.AVL;

public class AVLTree {
    class Node{
        int data;
        Node left;
        Node right;
        int height;

        public Node(int data) {
            this.data = data;
        }
    }
    Node root;

    public int height(Node node) {
        if(node == null) return -1;

        return node.height;
    }
    public AVLTree() {
        root = null;
    }
    public void insert(int data) {
        root = insert(root,data);
    }

    private Node insert(Node node, int data) {
        if(node == null) {
            node = new Node(data);
            return node;
        }
        if(data < node.data) {
            node.left = insert(node.left,data);
        }
        else if(data > node.data) {
            node.right = insert(node.right,data);
        }
        node.height = Math.max(height(node.left),height(node.right)) + 1;
        return rotate(node);
    }


    private Node rotate(Node node) {
        if(height(node.left) - height(node.right) > 1){
            //left heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                //left - left case
                return rightrotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0) {
                //left - right case
                node.left = leftrotate(node.left);
                return rightrotate(node);
            }
        }
        if(height(node.left) - height(node.right) < -1){
            //right heavy
            if(height(node.right.right) - height(node.right.left) > 0){
                //right - right case
                return leftrotate(node);
            }
            if(height(node.right.right) - height(node.right.left) < 0) {
                // right - left case
                node.right = rightrotate(node.right);
                return leftrotate(node);
            }
        }
        return node;
    }
    public Node rightrotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.left = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    public Node leftrotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        c.height = Math.max(height(c.left), height(c.right)) + 1;
        p.height = Math.max(height(p.left), height(p.right)) + 1;

        return p;
    }

    public boolean balanced(){
       return balanced(root);
    }
    public boolean balanced(Node node){
        if(node == null) return true;

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void populate(int[] nums){
        for (int num : nums) {
            this.insert(num);
        }
    }
    public int height(){
        return height(root);
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
