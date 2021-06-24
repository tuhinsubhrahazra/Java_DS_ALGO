package com.company.Sorting;

import java.util.Arrays;

public class margeTwoSortedArray {
    public static void main(String[] args) {
        int []arr1 = {5,50,50};
        int []arr2 = {10,20,50};

//        niveSolution(arr1,arr2);

        optimizeSolution(arr1,arr2);
    }

    public static void optimizeSolution(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;

        while (i < arr1.length && j<arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.println(arr1[i]);
                i++;
            } else {
                System.out.println(arr2[j]);
                j++;
            }
        }
        while (i< arr1.length){
            System.out.println(arr1[i]);
            i++;
        }
        while (j< arr2.length){
            System.out.println(arr2[j]);
            j++;
        }
    }

    private static void niveSolution(int[] arr1, int[] arr2) {
        int []finalArr = new int[arr1.length + arr2.length];

        int k =0;
        for (int i:arr1){
            finalArr[k] = i;
            k++;
        }
        for (int i : arr2){
            finalArr[k] = i;
            k++;
        }

        Arrays.sort(finalArr);

        for (int i : finalArr){
            System.out.println(i);
        }
    }
}
