package com.company.Hashing;

import java.util.ArrayList;
import java.util.Hashtable;

public class open_Addressing {

    public static class hasTable{
        int size ;
        int []arr;
        int isfull = 0;

        public hasTable(int size) {
            this.size = size;
            arr = new int[size];
            for (int i = 0;i<size;i++){
                arr[i] = -1;
            }
        }

        public void insert(int data){
            isfull ++;
            if (isfull  == size + 1){
                System.out.println(data + " is not inserted. Hash Table is full !!!");
                return;
            }
            int index = data % size;
            while (true) {
                if (arr[index] == -1) {
                    arr[index] = data;
                    break;
                } else {
                    if (index == size -1)
                        index = 0;
                    else
                        index ++;
                }
            }
        }

        public boolean searchHash(int data){
            int index = data % size;
            int startPosition = 0;

            while (true) {
                if (arr[index] == data) {
                    return true;
                }
                else if (startPosition == size){
                    return false;
                }
                else {
                    if (index == size -1)
                        index = 0;
                    else
                        index ++;
                }
                startPosition ++;
            }

        }

        public void hasDelete(int data){
            int index = data % size;
            while (true){
                if (arr[index] == data){
                    arr[index] = -2;
                    break;
                }
                else {
                    if (index == size -1){
                        index = 0;
                    }
                    else {
                        index ++;
                    }
                }
            }
        }

        public void printHash(){
            for (int v:arr){
                System.out.print(v + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hasTable hasTable = new hasTable(3);
        hasTable.insert(23);
        hasTable.insert(20);
        hasTable.insert(18);

        hasTable.printHash();
        System.out.println(hasTable.searchHash(18));
        hasTable.hasDelete(18);
        hasTable.printHash();
        System.out.println(hasTable.searchHash(18));

    }
}
