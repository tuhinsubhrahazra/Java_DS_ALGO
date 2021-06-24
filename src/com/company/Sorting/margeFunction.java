package com.company.Sorting;

public class margeFunction {
    public static void main(String[] args) {
        int []arr = {6,7,9,2,4,5};
        int low = 0;
        int high = 5;
        int mid = 2;

        merge(arr, low, mid, high);

        for (int i :arr){
            System.out.println(i);
        }
    }

    public static void merge(int[] a, int l, int m, int h) {
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
