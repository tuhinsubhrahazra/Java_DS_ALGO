package com.company.tree;

import javax.swing.text.html.ImageView;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree_traversal_spiral_form {

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

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.left = new Node(10);

//        printLevel(root);
//        printSprialOrder(root);
        printSprialOrder2(root);

    }

    private static void printSprialOrder2(Node root) {
        if (root== null){
            return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        boolean reverse = true;

        stack1.push(root);

        while (!stack1.isEmpty() || !stack2.isEmpty()){
            while (!stack1.isEmpty()){
                int size = stack1.size();
                for (int i=0;i<size;i++) {
                    Node temp = stack1.pop();
                    if (temp != null) {
                        System.out.print(temp.data + "  ");
                        if (temp.left != null) {
                            stack2.push(temp.left);
                        }
                        if (temp.right != null) {
                            stack2.push(temp.right);
                        }
                    }
                }
                System.out.println();
            }

            while (!stack2.isEmpty()){
                int size = stack2.size();
                for (int i=0;i<size;i++) {
                    Node temp = stack2.pop();
                    if (temp != null) {
                        System.out.print(temp.data + "  ");
                        if (temp.right != null) {
                            stack1.push(temp.right);
                        }
                        if (temp.left != null) {
                            stack1.push(temp.left);
                        }

                    }
                }
                System.out.println();
            }
        }

    }

    private static void printSprialOrder(Node root) {
        int st = 0;
        Queue<Node> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        boolean reverse = false;

        queue.add(root);
        while (!(queue.isEmpty())){
            int size = queue.size();
            for (int i=0;i<size;i++){
                Node ch = queue.poll();
                if (ch!= null){
                    if (reverse){
                        stack.push(ch.data);
                    }
                    else {
                        System.out.print(ch.data + "  ");
                    }
                    if (ch.left!= null){
                        queue.add(ch.left);
                    }
                    if (ch.right!= null){
                        queue.add(ch.right);
                    }
                }
            }

            while (!(stack.isEmpty())){
                System.out.print(stack.pop()+"  ");
            }
            reverse = !reverse;

            System.out.println();
        }
    }

    private static void printLevel(Node root) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while (!(queue.isEmpty())){
            int size = queue.size();
            for (int i=0;i<size;i++){
                Node ch = queue.poll();
                if (ch!=null){
                    System.out.print(ch.data+"  ");
                    if (ch.left!= null){
                        queue.add(ch.left);
                    }
                    if (ch.right!= null){
                        queue.add(ch.right);
                    }
                }
            }
            System.out.println();
        }
    }
}
