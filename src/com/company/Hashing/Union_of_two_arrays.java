package com.company.Hashing;

import java.util.HashSet;

public class Union_of_two_arrays {
    public static void main(String[] args) {
        int []arr1 = {15,20,5,15};
        int []arr2 = {15,15,15,20,10};

        int n = naiveSolution(arr1,arr2);

        System.out.println(n);
    }

    private static int naiveSolution(int[] arr1, int[] arr2) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i =0;i<arr1.length;i++){
            hashSet.add(arr1[i]);
        }
        for (int i =0;i< arr2.length;i++){
            hashSet.add(arr2[i]);
        }

        return hashSet.size();
    }
}
