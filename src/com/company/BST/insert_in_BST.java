package com.company.BST;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.LinkedList;
import java.util.Queue;

public class insert_in_BST {

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
//        Node root = insert(null,9);
//        insert(root,4);

        Node root = IterativeInsert(null,9);
        IterativeInsert(root,4);
        IterativeInsert(root,12);

        printTree(root);

    }

    private static Node IterativeInsert(Node root, int key) {
        Node temp = new Node(key);
        Node Present = null;
        Node curr = root;
        while (curr!=null){
            Present = curr;
            if (curr.data<key){
                curr = curr.right;
            }
            else{
                curr = curr.left;
            }
        }

        if (Present == null){
            return temp;
        }
        else if (Present.data < key){
            return Present.right = temp;
        }
        else {
            return Present.left = temp;
        }

    }

    public static Node insert(Node root,int key){
        if (root == null){
            return new Node(key);
        }
        if (root.data > key){
            root.left = insert(root.left,key);
        }
        else if (root.data < key){
            root.right = insert(root.right,key);
        }
        return root;
    }

    private static boolean searchElement(Node root, int d) {
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

    private static void printTree(Node root) {
        if (root == null){
            return;
        }
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
