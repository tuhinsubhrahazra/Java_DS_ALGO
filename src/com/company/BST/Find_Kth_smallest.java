package com.company.BST;

import java.util.TreeSet;

public class Find_Kth_smallest {

    public static class Node{
        int data;
        Node left;
        Node right;
        int lCount;

        public Node(int data){
            this.data = data;
            left= null;
            right = null;
            lCount = 0;
        }
    }

    public static Node insert(Node root, int data){
        if (root == null){
            return new Node(data);
        }
        if (data < root.data){
            root.left = insert(root.left,data);
            root.lCount++;
        }
        else {
            root.right = insert(root.right,data);
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        int []arr = { 20, 8, 22, 4, 12, 10, 14 };
        for (int i: arr){
            root = insert(root,i);
        }

//        printTree(root);
        int k = 7;
        NaiveSolution(root,k);
        EfficientSolution(root,k);
    }

    private static void printTree(Node root) {
        if (root != null) {
            printTree(root.left);
            System.out.println(root.data);
            printTree(root.right);
        }
    }

    private static void EfficientSolution(Node root,int k) {
        if ((root.lCount + 1) == k){
            System.out.println(root.data);
        }
        else if (k < (root.lCount+1)){
            EfficientSolution(root.left,k);
        }
        else {
            EfficientSolution(root.right ,(k-(root.lCount+1)));
        }
    }

    public static int index =0;
    private static void NaiveSolution(Node root,int k) {
        if (root != null) {
            NaiveSolution(root.left, k);
            index ++;
            if (k == index){
                System.out.println(root.data);
            }
            NaiveSolution(root.right,k);
        }
    }
}
