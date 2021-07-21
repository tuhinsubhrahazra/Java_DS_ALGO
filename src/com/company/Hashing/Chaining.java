package com.company.Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class Chaining {

    public static ArrayList<LinkedList<Integer>> Table  = new ArrayList<>();
    public static int BUCKET = 7;

    public static void main(String[] args) {

        for (int i = 0; i<BUCKET; i++) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            linkedList.add(0);
            Table.add(linkedList);
        }

        System.out.println(Table.size());

        insertion(17);
        insertion(47);
        insertion(75);
        System.out.println(search(17));
        delete(17);
        System.out.println(search(17));
    }

    public static void insertion(int key){
        int i = key % BUCKET;
        Table.get(i).add(key);
    }

    public static void delete(int key){
        int i = key % BUCKET;
        Table.get(i).remove(0);
    }

    public static boolean search(int key){
        int i = key % BUCKET;
        return Table.get(i).contains(key);

    }
}
