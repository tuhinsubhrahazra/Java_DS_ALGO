package com.company.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class serialization_and_deserialization {

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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.left = new Node(10);

        printLevel(root);

        ArrayList<Integer> store = new ArrayList<>();
        Serialize(root, store);
//        System.out.println(store);

        Node Root = DeSerialize(store);
        printLevel(Root);
    }

    public static int count =0;
    private static Node DeSerialize(ArrayList<Integer> store) {
        if (store.get(count) == -1){
            count++;
            return null;
        }
        Node root = new Node(store.get(count));
        count++;
        root.left = DeSerialize(store);
        root.right = DeSerialize(store);
        return root;
    }

    public static int NULL = -1;
    private static void Serialize(Node root, ArrayList<Integer> store) {
        if (root == null){
            store.add(NULL);
            return;
        }
        store.add(root.data);
        Serialize(root.left,store);
        Serialize(root.right,store);
    }

    private static void printLevel(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!(queue.isEmpty())){
            int size = queue.size();
            for (int i =0;i<size;i++){
                Node ch = queue.poll();
                if (ch != null){
                    System.out.print(ch.data+"  ");
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
