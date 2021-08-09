package com.company.Sorting;

public class margeSort {
    public static void main(String[] args) {
        int []arr = {5,6,7,9,2,3,4};

        margeSort2(arr,0,arr.length-1);

        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i:arr){
            System.out.println(i);
        }
    }

    private static void margeSort2(int[] arr, int low, int high) {
        if (high>low) {
            int mid = (low + high) / 2;
            margeSort2(arr, low, mid);
            margeSort2(arr, mid + 1, high);
            margeFunction(arr,low,mid,high);
        }
    }

    public static void margeFunction(int[] a, int l, int m, int h) {
        int n1 = (m - l) + 1;
        int n2 = h - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = a[i + l];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = a[i + 1 + m];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = right[j];
            j++;
            k++;
        }
    }
}
