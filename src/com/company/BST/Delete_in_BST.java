package com.company.BST;

import java.util.LinkedList;
import java.util.Queue;

public class Delete_in_BST {

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
        root.left =  new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        printTree(root);

        int x = 20;
        deleteNode(root,x);
        System.out.println();
        printTree(root);
    }

    private static Node deleteNode(Node root, int x) {
        if (root == null)
            return null;
        if (root.data < x){
            root.right = deleteNode(root.right,x);
        }
        else if (root.data > x){
            root.left = deleteNode(root.left,x);
        }
        else{
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            else{
                Node ip = inPost(root);
                root.data = ip.data;
                root.right = deleteNode(root.right,ip.data);
            }
        }
        return root;
    }

    private static Node inPost(Node root) {
        Node curr = root.right;
        while (curr!=null && curr.left != null){
            curr = curr.left;
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
