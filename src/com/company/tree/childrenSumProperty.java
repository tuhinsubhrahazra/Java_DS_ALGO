package com.company.tree;

public class childrenSumProperty {

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
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(3);
        root.left.right = new Node(5);

        boolean bool = isCSum(root);
        System.out.println(bool);
    }

    private static boolean isCSum(Node root) {
        if (root == null){
            return true;
        }
        if (root.left == null && root.right == null){
            return true;
        }
        int sum =0;
        if (root.left != null){
            sum+=root.left.data;
        }
        if (root.right != null){
            sum+=root.right.data;
        }
        return (root.data == sum && isCSum(root.left) && isCSum(root.right));
    }
}
