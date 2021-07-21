package com.company.BST;

import java.util.LinkedList;
import java.util.Queue;

public class Floor_in_BST {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right = new Node(70);
        root.right.right = new Node(80);
        root.right.left = new Node(60);
        root.right.left.left = new Node(55);
        root.right.left.right = new Node(65);
        root.right.left.left.left = new Node(54);
        root.right.left.left.right = new Node(57);

        printTree(root);

        System.out.println();

        int key = 35;
        int num = FloorValue(root,key);
        System.out.println(num);
    }

    private static int FloorValue(Node root, int key) {
        if (root == null){
            return 0;
        }
        int curr = 0;
        while (root != null){
            if (root.data == key ){
                return root.data;
            }
            if (key < root.data){
                root = root.left;
            }
            else {
                curr = root.data;
                root = root.right;
            }
        }
        return curr;
    }

    private static void printTree(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int s = queue.size();
            for (int i =0;i<s;i++){
                Node ch = queue.poll();
                if (ch != null) {
                    System.out.print(ch.data + "  ");

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
