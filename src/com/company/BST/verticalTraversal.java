package com.company.BST;

import java.util.*;

public class verticalTraversal {

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

    public static class Pair{
        Node p;
        int i;
        public Pair(Node p,int i){
            this.p = p;
            this.i = i;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        VPrint(root);

    }

    private static void VPrint(Node root) {
        Queue<Pair> queue = new LinkedList<>();
        TreeMap<Integer, ArrayList<Integer>> treeMap = new TreeMap<>();

        queue.add(new Pair(root,0));
        while (!queue.isEmpty()){
            Pair t = queue.poll();
            Node ch = t.p;
            int index = t.i;
            if (ch != null){
                if (treeMap.containsKey(index)) {
                    treeMap.get(index).add(ch.data);
                }
                else{
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(ch.data);
                    treeMap.put(index,arrayList);
                }
                if (ch.left != null){
                    queue.add(new Pair(ch.left,index-1));
                }
                if (ch.right !=null){
                    queue.add(new Pair(ch.right,index+1));
                }
            }
        }

        for (Map.Entry<Integer,ArrayList<Integer>> m : treeMap.entrySet()){
            ArrayList<Integer> arrayList = m.getValue();
            for (int i:arrayList){
                System.out.print(i+ "  ");
            }
            System.out.println();
        }
    }
}
