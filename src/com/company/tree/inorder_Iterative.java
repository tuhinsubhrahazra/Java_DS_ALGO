package com.company.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class inorder_Iterative {
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

//        printLevel(root);

        printUsingIterative(root);
    }

    private static void printUsingIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        Node curr = root;

        while (curr !=null || !stack.isEmpty()){
            while (curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.println(curr.data);
            curr = curr.right;
        }
    }

    private static void printLevel(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!(queue.isEmpty())){
            int size = queue.size();
            for (int i =0 ;i<size;i++){
                Node ch = queue.poll();
                if (ch!=null){
                    System.out.print(ch.data+"  ");

                    if (ch.left != null){
                        queue.add(ch.left);
                    }
                    if (ch.right != null){
                        queue.add(ch.right);
                    }
                }
            }
            System.out.println();
        }
    }
}
