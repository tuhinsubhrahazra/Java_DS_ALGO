package com.company.BST;

import java.util.LinkedList;
import java.util.Queue;

public class Ceil_in_BST {

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
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(30);

//        printTree(root);
        int key = 3;

        System.out.println(findCeil(root,key));
    }

    private static int findCeil(Node root,int key) {
        if (root == null){
            return -1;
        }
        int ans = -1;
        while (root!=null) {
            if (root.data == key) {
                return root.data;
            }
            else if (key > root.data) {
                root = root.right;
            }
            else {
                ans = root.data;
                root = root.left;
            }
        }
        return ans;
    }

    private static void printTree(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int s = queue.size();
            for (int i =0;i<s;i++){
                Node ch = queue.poll();
                if (ch!= null){
                    System.out.print(ch.data+"  ");
                    if (ch.left !=null){
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
