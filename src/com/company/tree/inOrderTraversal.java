package com.company.tree;

import com.company.tree.*;

public class inOrderTraversal {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        inorder(root);
    }

    private static void inorder(Node root) {
        if (root != null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
}
