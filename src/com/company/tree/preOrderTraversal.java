package com.company.tree;

public class preOrderTraversal {

    public static class Node2 {
        int data;
        Node2 left;
        Node2 right;

        public Node2(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        Node2 root = new Node2(10);
        root.left = new Node2(20);
        root.right = new Node2(30);
        root.right.left = new Node2(40);
        root.right.right = new Node2(50);

        preOrder(root);
    }

    private static void preOrder(Node2 root) {
        if (root != null){
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }

    }
}
