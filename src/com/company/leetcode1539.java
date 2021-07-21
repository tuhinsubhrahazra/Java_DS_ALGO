package com.company;

import java.util.HashSet;

public class leetcode1539 {
    public static void main(String[] args) {
        int []arr = {2};
        int k =1;

        // O(n)
//        System.out.println(findKthPositive(arr,k));

        //O(log n)
        System.out.println(findKthPositiveOptimized(arr,k));

    }

    private static int findKthPositiveOptimized(int[] arr, int k) {
        int low = 0;
        int high = arr.length -1;

        while (low<=high){
            int mid = (low + high)/2;
            int countNoElement = arr[mid] - (mid + 1);
            if (countNoElement < k){
                low  = mid + 1;
            }
            else{
                high = mid -1 ;
            }
        }

        if (high == -1){
            return k;
        }
        return arr[high] + (k - (arr[high] - (high + 1)));
    }

    public static int findKthPositive(int[] arr, int k) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int n:arr){
            hashSet.add(n);
        }
        int v =1;
        while (true){
            if (!hashSet.contains(v)){
                k--;
            }
            if (k==0){
                return v;
            }
            v++;
        }
    }
}
