package com.company.BST;

import java.math.BigInteger;
import java.util.Map;
import java.util.TreeMap;

public class Vertical_sum_in_a_Tree {

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
        root.left = new Node(20);
        root.right = new Node(50);
        root.left.left = new Node(30);
        root.left.right = new Node(40);

        //30 20 50 50

        VSum(root);
    }

    private static void VSum(Node root) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        VsumR(root,map,0);
        for (Map.Entry sum: map.entrySet()){
            System.out.println(sum.getValue());
        }
    }

    private static void VsumR(Node root, TreeMap<Integer, Integer> map, int i) {
        if (root!=null) {
            VsumR(root.left, map, i - 1);
            if (map.get(i) != null){
                int v = map.get(i);
                map.put(i,v+ root.data);
            }
            else {
                map.put(i,root.data);
            }
            VsumR(root.right, map, i + 1);
        }
    }
}
