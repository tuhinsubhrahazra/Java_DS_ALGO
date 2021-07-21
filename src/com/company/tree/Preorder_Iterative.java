package com.company.tree;

import java.util.Stack;

public class Preorder_Iterative {
    private static class Node{
        int data ;
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
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        // Naive Solution

//        printIterative(root);
//        System.out.println();
//        printIterative2(root);

        // Efficient Solution

        IterativePreorder(root);


    }

    private static void IterativePreorder(Node root) {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node curr = root;
        while (!stack.isEmpty()){
            while (curr != null){
                System.out.print(curr.data+ "  ");
                if (curr.right != null) {
                    stack.push(curr.right);
                }
                curr = curr.left;
            }
            curr = stack.pop();
        }
    }

    private static void printIterative2(Node root) {
        if (root == null){
            return ;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            Node ch = stack.pop();
            System.out.print(ch.data + "  ");
            if (ch.right != null){
                stack.push(ch.right);
            }
            if (ch.left != null){
                stack.push(ch.left);
            }
        }
    }

    private static void printIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        Node ch = root;

        while (ch != null || !stack.isEmpty()){
            while (ch != null){
                System.out.print(ch.data + "  ");
                stack.push(ch);
                ch = ch.left;
            }
            ch = stack.pop();
            ch = ch.right;
        }
    }
}
