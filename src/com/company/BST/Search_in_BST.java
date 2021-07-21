package com.company.BST;

import java.util.LinkedList;
import java.util.Queue;

public class Search_in_BST {

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
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.right = new Node(80);
        root.right.left.left = new Node(16);

//        printTree(root);

        int d = 80;
        System.out.println(searchElement(root,d));

    }

    private static boolean searchElement(Node root,int d) {
        if (root == null){
            return false;
        }
        else if (root.data == d){
            return true;
        }
        else if(d < root.data){
            return searchElement(root.left, d);
        }
        else{
            return searchElement(root.right, d);
        }
    }

    public static void printTree(Node root) {
        if (root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i<size;i++){
                Node child = queue.poll();
                assert child != null;
                System.out.print(child.data+"  ");
                if (child.left != null){
                    queue.add(child.left);
                }
                if (child.right != null){
                    queue.add(child.right);
                }
            }
            System.out.println();
        }
    }
}
