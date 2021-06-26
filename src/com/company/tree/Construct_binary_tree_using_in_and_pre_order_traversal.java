package com.company.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Construct_binary_tree_using_in_and_pre_order_traversal {

    private static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        int []in = {20,10,40,30,50};
        int []pre = {10,20,30,40,50};

        Node root = consTruct(in,pre,0,in.length-1);

        printTreeLevelByLevel(root);
    }

    private static void printTreeLevelByLevel(Node root) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while (!(queue.isEmpty())){
            int size = queue.size();
            for (int i=0;i<size;i++) {
                Node node = queue.poll();

                if (node != null) {
                    System.out.print(node.data + "  ");
                    if (node.left != null) {
                        queue.add(node.left);
                        queue.add(node.right);
                    }
                }
            }
            System.out.println();
        }
    }

    private static int previous = 0;
    private static Node consTruct(int[] in, int[] pre, int startIndex, int endIndex) {
        if (startIndex>endIndex){
            return null;
        }
        Node root = new Node(pre[previous++]);

        int index = 0;
        for (int i =startIndex;i<=endIndex;i++){
            if (in[i] == root.data){
                index = i;
                break;
            }
        }
        root.left = consTruct(in,pre,startIndex,index-1);
        root.right = consTruct(in,pre,index+1,endIndex);

        return root;
    }
}
