package com.company.Heap;

import java.util.PrimitiveIterator;
import java.util.PriorityQueue;

public class k_Closest_element {

    public static class pair{
        int data;
        int diff;

        public pair(int data,int diff){
            this.data = data;
            this.diff = diff;
        }
    }

    public static void main(String[] args) {
        int []arr = {10,15,7,3,4};
        int x = 8;
        int k = 4;

        NaiveSolution(arr,x,k);
        EfficientSolution(arr,x,k);
    }

    private static void NaiveSolution(int[] arr, int x, int k) {
        boolean []visited = new boolean[arr.length];
        for (int i =0;i<k;i++){
            int minDifference = Integer.MAX_VALUE;
            int Index = -1;
            for (int j =0;j<arr.length;j++){
                if (!visited[j]) {
                    int diff;
                    if (x>arr[j])
                        diff = x-arr[j];
                    else
                        diff = arr[j]-x;

                    if (diff < minDifference) {
                        minDifference = diff;
                        Index = j;
                    }
                }
            }
            System.out.println(arr[Index]);
            visited[Index] = true;
        }
    }

    private static void EfficientSolution(int[] arr, int x, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for (int i =0;i<arr.length;i++){
            pq.add(new pair(arr[i],0));
        }
        for (int i=0;i<arr.length;i++){

        }
    }
}
