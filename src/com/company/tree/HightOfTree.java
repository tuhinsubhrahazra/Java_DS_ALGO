package com.company.tree;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class HightOfTree {

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

        int h = height(root);
        System.out.println("The Height of The tree is : "+h);
    }

    private static int height(Node root) {
        if (root == null){
            return 0;
        }
        else{
            return Math.max(height(root.left),height(root.right)) + 1;
        }
    }
}
