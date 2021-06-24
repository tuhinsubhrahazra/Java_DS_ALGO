package com.company.Sorting;

public class quickSort {
    public static void main(String[] args) {
        int []arr = {8,4,7,9,3,10,5};
        int low = 0;
        int high = arr.length-1;

//        LomutoSort(arr,low,high);
//        System.out.println();
        HoareSort(arr,low,high);

        for (int i :arr){
            System.out.println(i);
        }
    }

    private static void HoareSort(int[] arr, int low, int high) {
        if (low<high){
            int p = HoaresPartition(arr,low,high);
            HoareSort(arr,low,p);
            HoareSort(arr,p+1,high);
        }
    }

    private static void LomutoSort(int[] arr, int low, int high) {
        if (low<high){
            int p = LomutoPartition(arr,low,high);
            LomutoSort(arr,low,p-1);
            LomutoSort(arr,p+1,high);
        }
    }


    private static int HoaresPartition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                return j;
            }

            Swap(arr, i, j);
        }

    }

    private static int LomutoPartition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low -1;
        for (int j = low; j<=high - 1; j++){
            if (arr[j] < pivot){
                i++;
                Swap(arr,j,i);
            }
        }

        Swap(arr, i + 1, high);

        return i+1;
    }

    private static void Swap(int []arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
