package com.company.tree;

public class sizeOfBinaryTree {

    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);

        int size = size(root);
        System.out.println(size);
    }

    private static int size(Node root) {
        if (root == null){
            return 0;
        }
        else {
            return 1 + size(root.left) + size(root.right);
        }
    }
}
