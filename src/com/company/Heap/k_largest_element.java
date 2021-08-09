package com.company.Heap;

import java.util.PriorityQueue;

public class k_largest_element {
    public static void main(String[] args) {
        int []arr = {8,6,4,10,9};
        int k =3;

        EfficientSolution(arr,k);
    }

    private static void EfficientSolution(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i =0;i<k;i++){
            pq.add(arr[i]);
        }
        for (int i =k; i< arr.length;i++){
            if (arr[i] > pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }

        System.out.println(pq);
    }
}
