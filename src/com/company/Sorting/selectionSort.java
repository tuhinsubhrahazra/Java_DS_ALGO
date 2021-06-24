package com.company.Sorting;


public class selectionSort {
    public static void main(String[] args) {
//        System.out.println(1);
        int []arr = {5,7,2,4,9,11,45};

        arr = NativeSolution(arr);
        arr = OptimizeSolution(arr);

        for (int i :arr){
            System.out.println(i);
        }
    }

    private static int[] OptimizeSolution(int[] arr) {
        int minIndex ;
        int swap;
        for (int i = 0; i< arr.length ; i++){
            minIndex = i;
            for (int j = i + 1 ;j<arr.length;j++){
                if (arr[j]<minIndex){
                    minIndex = j;
                }
            }
            swap = arr[minIndex];
            arr[i] = arr[minIndex];
            arr[minIndex] = swap;
        }

        return arr;
    }

    private static int[] NativeSolution (int[] a) {
        int[] arr = new int[a.length];
        int maxIndex = 0;
        for (int i=0;i<arr.length;i++){
            for (int j = 0; j<a.length;j++){
                if (a[j]>a[maxIndex]){
                    maxIndex = j;
                }
            }
            arr[arr.length -1 - i] = a[maxIndex];
            a[maxIndex] = 0;
        }

        return arr;
    }
}
