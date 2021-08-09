package com.company.Heap;

import java.util.Collection;
import java.util.PriorityQueue;

public class Sort_k_th_sorted_array {
    public static void main(String[] args) {
        int []arr = {9,8,7,18,19,17};
        int k = 2;

        sort(arr,k);

    }

    private static void sort(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i=0;i< arr.length;i++){
            priorityQueue.add(arr[i]);
        }
        System.out.println(priorityQueue);
        int i=0;
        while (!priorityQueue.isEmpty()){
            arr[i] = priorityQueue.poll();
            i++;
        }

        for (int v:arr){
            System.out.print(v+"  ");
        }
    }
}
