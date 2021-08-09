package com.company.BST;

import java.util.LinkedList;
import java.util.Queue;

public class Fix_BST_with_two_nodes_swaped {

    public static class Node{
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
        Node root = new Node(20);
        root.left = new Node(60);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.right = new Node(80);
        root.right.left = new Node(8);
        root.right.right = new Node(100);

        printTree(root);

        solution(root);
        System.out.println();
        System.out.println(first.data);
        System.out.println(second.data);
        System.out.println();

        int temp = first.data;
        first.data = second.data;
        second.data = temp;

        printTree(root);

    }

    private static void swapNodes(Node root,Node first, Node second) {
        if (root == null){
            return;
        }
        swapNodes(root.left, first,second);
        if (root == second){
            root.data = first.data;
        }
        if (root == first){
            root.data = second.data;
        }

        swapNodes(root.right, first,second);
    }


    public static Node prev = null;
    public static Node first = null;
    public static Node second = null;
    private static void solution(Node root) {
        if (root == null){
            return;
        }
        solution(root.left);
        if (prev != null && prev.data>root.data ) {
            if (first ==null) {
                first = prev;
            }
            second = root;

        }
        prev = root;
        solution(root.right);
    }


    private static void printTree(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int s = queue.size();
            for (int i =0;i<s;i++){
                Node ch = queue.poll();
                if (ch != null){
                    System.out.print(ch.data + "  ");
                    if (ch.left != null) {
                        queue.add(ch.left);
                    }
                    if (ch.right!= null) {
                        queue.add(ch.right);
                    }
                }
            }

            System.out.println();
        }

    }
}
