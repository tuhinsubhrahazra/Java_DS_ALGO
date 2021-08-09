package com.company.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PerchasingMaximumItems {
    public static void main(String[] args) {
//        int []arr = {1,12,5,111,200};
        int []arr = {20,10,5,30,100};
        int sum = 35;
//        int sum =10;

        naiveSolution(arr,sum);
        efficientSolution(arr,sum);
    }

    private static void efficientSolution(int[] cost, int sum) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();

        for(int i=0;i< cost.length;i++)
            pq.add(cost[i]);

        int count =0;
        int minIndex =0;
        while (minIndex<=sum && !pq.isEmpty()){
            minIndex = pq.poll();
            sum = sum - minIndex;
            count++;
        }
        System.out.println(count);
    }

    private static void naiveSolution(int[] arr, int sum) {
        Arrays.sort(arr);
        int count = 0;

        int i =0;
        while (arr[i]<=sum){
            sum = sum - arr[i];
            i++;
            count++;
        }
        System.out.println(count);
    }
}
