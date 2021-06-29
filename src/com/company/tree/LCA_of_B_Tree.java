package com.company.tree;

import java.util.ArrayList;

public class LCA_of_B_Tree {

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
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        int lca = LCA(root,20,50);

        System.out.println(lca);
    }

    private static int LCA(Node root,int n1,int n2) {
        if (root == null){
            return 0;
        }
        ArrayList<Integer> path1 = new ArrayList<>();
        ArrayList<Integer> path2 = new ArrayList<>();

        if (!getPath(root, path1, n1) || !getPath(root, path2, n2)){
            return 0;
        }

        int in = 0;
        for (int i = 0;i<Math.min(path1.size(),path2.size());i++){
            if(path1.get(i).equals(path2.get(i))){
                in = path1.get(i);
            }
        }

        return in;
    }

    private static boolean getPath(Node root, ArrayList<Integer> path, int n) {
        if (root == null){
            return false;
        }
        path.add(root.data);
        if (root.data == n){
            return true;
        }
        if(getPath(root.left,path,n) || getPath(root.right,path,n)){
            return true;
        }
        path.remove(path.size()-1);

        return false;
    }
}
