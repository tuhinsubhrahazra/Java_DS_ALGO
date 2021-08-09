package com.company.BST;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Pair_with_given_sum_in_BST {

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
        Node root = new Node(10);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(11);
        root.right.right = new Node(30);
        root.right.right.left = new Node(25);

        Node root2 = new Node(20);
        root2.left = new Node(8);
        root2.right = new Node(40);
        root2.right.left = new Node(35);

        int sum2 = 49;

//        printTree(root);
        int sum = 33;

        System.out.println(solution(root,sum));
        hashSet.clear();
        System.out.println(solution(root2,sum2));
    }

    public static HashSet<Integer> hashSet = new HashSet<>();
    private static boolean solution(Node root, int sum) {
        if (root == null){
            return false;
        }
        if(solution(root.left, sum)){
            return true;
        }
        if (hashSet.contains(sum-root.data)){
            return true;
        }
        else {
            hashSet.add(root.data);
        }
        return solution(root.right,sum);
    }

    private static void printTree(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int s = queue.size();
            for (int i =0;i<s;i++){
                Node ch = queue.poll();
                if (ch!=null){
                    System.out.print(ch.data+"  ");
                    if (ch.left!=null){
                        queue.add(ch.left);
                    }
                    if (ch.right !=null){
                        queue.add(ch.right);
                    }
                }
            }
            System.out.println();
        }
    }
}
