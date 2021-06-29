package com.company.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Highest_diametere_of_B_Tree {

    private static class Node{
        int data ;
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
        root.left.right = new Node(80);
        root.left.right.right = new Node(90);
        root.left.right.right.right = new Node(18);
        root.right = new Node(50);
        root.left.left = new Node(30);
        root.left.left.left = new Node(40);
        root.left.left.right = new Node(50);
        root.left.left.left.left = new Node(60);

//        printLevel(root);

        int h = Highest_Diametere(root);

        System.out.println(h);
    }



    private static int Highest_Diametere(Node root) {
        if (root== null){
            return 0;
        }
        int D = 1 + Height(root.left) + Height(root.right);

        int lD = Highest_Diametere(root.left);
        int rD = Highest_Diametere(root.right);

        return Math.max(D,Math.max(lD,rD));
    }

    private static int Height(Node root) {
        if (root == null){
            return 0;
        }
        else {
            return Math.max(Height(root.left),Height(root.right)) + 1;
        }
    }

    private static void printLevel(Node root) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while (!(queue.isEmpty())){
            int size = queue.size();
            for (int i=0;i<size;i++){
                Node ch = queue.poll();
                if (ch!=null){
                    System.out.print(ch.data+"  ");
                    if (ch.left!= null){
                        queue.add(ch.left);
                    }
                    if (ch.right!= null){
                        queue.add(ch.right);
                    }
                }
            }
            System.out.println();
        }
    }
}
