package com.company.BST;

import java.util.TreeSet;

public class celing_on_left_side {
    public static void main(String[] args) {
        int []arr = {6,18,4,5};

        solution(arr);
    }

    private static void solution(int[] arr) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int j : arr) {
            if (treeSet.ceiling(j) == null) {
                System.out.println(-1);
            } else {
                System.out.println(treeSet.ceiling(j));
            }
            treeSet.add(j);
        }
    }
}
