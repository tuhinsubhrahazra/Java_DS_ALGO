package com.company.BST;

public class check_for_BST {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left= null;
            right = null;
        }
    }

    public static Node insert(Node root, int data){
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
        root = insert(root,3);
        root = insert(root,5);
        root = insert(root,2);
        root = insert(root,9);

        System.out.println(Naive(root));
        System.out.println(Efficient(root));
    }

    public static int prev = Integer.MIN_VALUE;
    private static boolean Efficient(Node root) {
        if (root == null)
            return true;

        if (!Efficient(root.left))
            return false;

        if (root.data<prev)
            return false;

        prev = root.data;

        return Efficient(root.right);
    }


    private static boolean Naive(Node root) {
        if(root==null){
            return true;
        }
        if (maxTree(root.left) > root.data){
            return false;
        }
        if (minTree(root.right) < root.data){
            return false;
        }
        return Naive(root.left) && Naive(root.right);
    }

    public static int maxTree(Node root){
        if (root== null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(maxTree(root.left),maxTree(root.right)));
    }

    public static int minTree(Node root){
        if (root== null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data,Math.min(minTree(root.left),minTree(root.right)));
    }


}
