package com.company;

public class practice1 {

    static class node
    {
        int data;
        node left;
        node right;
        node(int k){
            data=k;
            left=right=null;
        }
    }

    public static void main(String[] args) {
        node root = new node(10);
        root.left = new node(20);
        root.right = new node(30);
        root.right.left = new node(40);
        root.right.right = new node(50);

        int max = maximumElement(root);

        System.out.println(max);

    }

    private static int  maximumElement(node root) {
        if (root == null){
            return Integer.MIN_VALUE;
        }
        else{
            return Math.max(root.data, Math.max(maximumElement(root.left),maximumElement(root.right)));
        }
    }

}
