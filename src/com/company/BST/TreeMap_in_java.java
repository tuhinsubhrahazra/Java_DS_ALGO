package com.company.BST;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMap_in_java {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();

        treeMap.put(0,10);
        treeMap.put(-1,20);
        treeMap.put(1,30);
        treeMap.put(-2,40);
        treeMap.put(0,50);

        System.out.println(treeMap);
    }
}
