package com.company.tree;

public class maxOfBinaryTree {

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

        int max = getMax(root);
        System.out.println(max);
    }

    private static int getMax(Node root) {
        if (root == null){
            return Integer.MIN_VALUE;
        }
        else {
            return Math.max(root.data, Math.max(getMax(root.left), getMax(root.right)));
        }
    }
}
