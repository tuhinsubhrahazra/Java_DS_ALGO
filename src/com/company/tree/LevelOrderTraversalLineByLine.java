package com.company.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLineByLine {

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

//        Method1(root);

        Method2(root);

    }

    private static void Method2(Node root) {
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

    private static void Method1(Node root) {
        if (root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);

        while (queue.size()!= 1){
            Node nd = queue.poll();
            if (nd == null){
                System.out.println();
                queue.add(null);
            }
            else{
                System.out.print(nd.data+"  ");
                if (nd.left != null) {
                    queue.add(nd.left);
                }
                if (nd.right != null) {
                    queue.add(nd.right);
                }
            }

        }

    }
}
