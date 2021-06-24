package com.company.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class unionOfTwoSortedArray {
    public static void main(String[] args) {
        int []arr1 = {1,20,20,40,60,60};
        int []arr2 = {2,20,20,20,40};

//        niveSolution(arr1,arr2);

        optimizeSolution(arr1,arr2);
    }

    private static void optimizeSolution(int[] arr1, int[] arr2) {
        int i =0;
        int j =0;

        while (i<arr1.length && j<arr2.length){

            if (i>0 && arr1[i] == arr1[i-1]){
                i++;
                continue;
            }
            if (j>0 && arr2[j] == arr2[j-1]){
                j++;
                continue;
            }

            if (arr1[i]<arr2[j]){
                System.out.println(arr1[i]);
                i++;
            }
            else if (arr1[i]>arr2[j]){
                System.out.println(arr2[j]);
                j++;
            }
            else{
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }

        while (i<arr1.length){
            if (i>0 && arr1[i] != arr1[i-1]) {
                System.out.println(arr1[i]);
            }
            i++;
        }
        while (j< arr2.length){
            if (j>0 && arr2[j] != arr1[j-1]) {
                System.out.println(arr2[j]);
            }
            j++;
        }
    }

    private static void niveSolution(int[] arr1, int[] arr2) {
        int []newArr = new int[arr1.length+arr2.length];

        int k =0;
        while (k<arr1.length){
            newArr[k] = arr1[k];
            k++;
        }
        int l =0;
        while (k < arr2.length + arr1.length){
            newArr[k] = arr2[l];
            k++;
            l++;
        }

        Arrays.sort(newArr);

        for (int i =0;i< newArr.length;i++){
            if (i == 0 || newArr[i] != newArr[i-1]){
                System.out.println(newArr[i]);
            }
        }


    }
}
