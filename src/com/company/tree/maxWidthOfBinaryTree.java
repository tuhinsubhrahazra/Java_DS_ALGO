package com.company.tree;

import java.util.*;

public class maxWidthOfBinaryTree {

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
        Node root = new Node(8);
        root.left = new Node(30);
        root.right = new Node(20);
        root.left.left = new Node(90);
        root.left.right = new Node(100);
        root.right.left = new Node(70);
        root.right.right = new Node(300);

        int max = maxWidth(root);
        System.out.println(max);
    }

    private static int maxWidth(Node root) {
        int res = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!(queue.isEmpty())){
            int size = queue.size();
            for (int i=0;i<size;i++){
                Node child = queue.poll();
                if (child != null) {
                    if (child.left != null) {
                        queue.add(child.left);
                    }
                    if (child.right != null){
                        queue.add(child.right);
                    }
                }
            }
            if (size > res){
                res = size;
            }
        }

        return res;
    }
}
