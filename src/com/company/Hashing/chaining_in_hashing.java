package com.company.Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class chaining_in_hashing {
    public static ArrayList<LinkedList<Integer>> linkedListArrayList = new ArrayList<>();

    public static void main(String[] args) {

        for (int i =0;i<7;i++){
            LinkedList<Integer>linkedList = new LinkedList<>();
            linkedList.add(0);
            linkedListArrayList.add(linkedList);
        }

        hashInsert(12);
        hashInsert(52);
        hashInsert(32);
        System.out.println(search(52));
        delete(52);
        System.out.println(search(52));

        System.out.println(linkedListArrayList);
    }

    public static void hashInsert(int data){
        int index = data % 7;
        linkedListArrayList.get(index).add(data);
    }

    public static boolean search(int data) {
        int index = data % 7;
        return linkedListArrayList.get(index).contains(data);

    }

    public static void delete(int data){
        int index = data % 7;
        for (int i =0;i<linkedListArrayList.get(index).size();i++){
            if (linkedListArrayList.get(index).get(i) == data){
                linkedListArrayList.get(index).remove(i);
                break;
            }
        }
    }

}
