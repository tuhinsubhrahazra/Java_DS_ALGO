package com.company.tree;

import java.util.Queue;

import java.util.LinkedList;

public class levelOrderTraversal {

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
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);

        NaiveSolution(root);

        System.out.println();
        System.out.println("----------------------------");

        EfficientSolution(root);
    }

    private static void EfficientSolution(Node root) {
        if (root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node cl = queue.poll();
            System.out.print(cl.data + "  ");
            if (cl.left != null){
                queue.add(cl.left);
            }
            if (cl.right != null){
                queue.add(cl.right);
            }
        }
    }

    private static void NaiveSolution(Node root) {
        int h = heightOfTree(root);
        for (int i =0 ; i<h; i++){
            kThIndex(root,i);
        }
    }

    private static void kThIndex(Node root,int k){
        if (root == null){
            return;
        }
        if (k == 0){
            System.out.print(root.data + "  ");
        }
        else{
            kThIndex(root.left,k-1);
            kThIndex(root.right,k-1);
        }
    }

    private static int heightOfTree(Node root) {
        if (root == null){
            return 0;
        }
        else{
            return Math.max(heightOfTree(root.left),heightOfTree(root.right)) + 1;
        }
    }

}
