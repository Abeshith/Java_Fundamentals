package com.SegmentTree;

public class SegmentTree {
    class Node{
        int data;
        Node left;
        Node right;
        int start;
        int end;
        int height;

        public Node(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    Node root;

    public SegmentTree(int[] arr){
        root = ConstructTree(arr,0,arr.length - 1);
    }

    private Node ConstructTree(int[] arr,int start,int end) {
        if(start == end){
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }
        Node node =new Node(start,end);

        int mid = start + (end - start) / 2;
        node.left = ConstructTree(arr,start,mid);
        node.right = ConstructTree(arr,mid+1,end);

        node.data = node.left.data + node.right.data;
         return node;
    }
    public void display(){
        display(root);
    }
    private void display(Node node){
        if(node == null){
            return;
        }
        if (node == null) {
            return;
        }

        // Display current node's data
        StringBuilder sb = new StringBuilder();
        sb.append("[" + node.start + ", " + node.end + "] -> " + node.data);

        if (node.left != null) {
            sb.append(", Left: [" + node.left.start + ", " + node.left.end + "] -> " + node.left.data);
        } else {
            sb.append(", Left: null");
        }

        if (node.right != null) {
            sb.append(", Right: [" + node.right.start + ", " + node.right.end + "] -> " + node.right.data);
        } else {
            sb.append(", Right: null");
        }

        System.out.println(sb);

        // Recursively display left and right subtrees
        display(node.left);
        display(node.right);
    }

    public int query(int querystart,int queryend){
        return query(root,querystart,queryend);
    }
    private int query(Node node,int querystart,int queryend){
        if(node.start >= querystart && node.end <= queryend) {
            return node.data;
        }else if(node.start > queryend || node.end < querystart) {
            return 0;
        }else{
            return query(node.left,querystart,queryend) + query(node.right,querystart,queryend);
        }
    }
    public void update(int index, int value){
        root.data = update(root,index,value);
    }
    private int update(Node node,int index,int value){
        if(index >= node.start && index <= node.end){
            if(index == node.start && index == node.end){
                node.data = value;
                return node.data;
            }else{
                node.data = update(node.left,index,value) + update(node.right,index,value);
                return node.data;
            }
        }
        return node.data;
    }

}
