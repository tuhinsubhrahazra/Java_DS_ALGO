package com.company.BST;

public class Vertical_sum_in_a_Binary_Tree {

    public static class Node{
        int data;
        Node left;
        Node right;
        int hValue;

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node insert(Node root ,int data){
        if (root == null){
            return new Node(data);
        }
        if (data < root.data){
            root.left = insert(root.left,data);
        }
        else {
            root.right = insert(root.right,data);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root,10);
        root = insert(root,20);
        root = insert(root,30);
        root = insert(root,5);
        root = insert(root,15);

        inorder(root);
    }

    private static void inorder(Node root) {
        if (root!=null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
}
