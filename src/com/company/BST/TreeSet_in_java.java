package com.company.BST;

import java.util.TreeSet;

public class TreeSet_in_java {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(15);
        treeSet.add(3);
        treeSet.add(9);
        treeSet.add(55);

        System.out.println(treeSet);
        System.out.println(treeSet.lower(9));
        System.out.println(treeSet.higher(9));
        System.out.println(treeSet.floor(4));
        System.out.println(treeSet.ceiling(10));

        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("gfg");
        treeSet2.add("Tuhin");
        treeSet2.add("IDE");
        treeSet2.add("BST");
        treeSet2.add("Tree Set");
        treeSet2.add("abb");
        treeSet2.add("aaa");
        treeSet2.add("abc");
        treeSet2.add("AAA");

        System.out.println(treeSet2);

    }
}
