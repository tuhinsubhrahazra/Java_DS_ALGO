package com.company.Heap;

public class HeapSort {

    public static void sort(int []arr){
        int size = arr.length;
        for (int i = arr.length /2 -1; i>=0;i--){
            maxHeapify(arr,i,size);
        }

        while (size!=0){
            int temp = arr[0];
            arr[0] = arr[size-1];
            arr[size-1] = temp;
            size--;
            maxHeapify(arr,0,size);
        }
    }

    private static void maxHeapify(int []arr,int i,int size) {
        int left = 2*i +1;
        int right = 2*i +2;
        int highest = i;

        if (left<size && arr[left]>arr[highest]){
            highest = left;
        }
        if (right < size && arr[right] > arr[highest]){
            highest = right;
        }

        if (i != highest){
            int temp = arr[i];
            arr[i] = arr[highest];
            arr[highest] = temp;

            maxHeapify(arr,highest,size);
        }
    }

    public static void main(String[] args) {
        int []arr = {6,2,4,3,4,4,0,2,1,5,9,12,34,56,2,7};
        sort(arr);
        for (int i:arr){
            System.out.println(i);
        }
    }
}
