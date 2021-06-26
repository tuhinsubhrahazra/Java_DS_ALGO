package com.company.tree;

public class convertBTtoLL {

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
       root.left = new Node(5);
       root.right = new Node(20);
       root.right.left = new Node(30);
       root.right.right = new Node(35);

       printTree(root);

       Node head = toLinkedList(root);

       printLinkedList(head);
    }

    private static void printLinkedList(Node head) {
        while (head!= null){
            System.out.println(head.data);
            head = head.right;
        }
    }

    private static Node prev = null;
    private static Node toLinkedList(Node root) {
        if (root == null){
            return root;
        }
        Node head = toLinkedList(root.left);
        if (prev== null){
            head = root;
        }
        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        toLinkedList(root.right);
        return head;
    }

    private static void printTree(Node root) {
        if (root != null){
            printTree(root.left);
            System.out.println(root.data);
            printTree(root.right);
        }
    }

}
