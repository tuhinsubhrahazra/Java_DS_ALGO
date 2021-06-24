package com.company.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("hello");

        int []arr = {2,3,8,9,4,1,6};

        for (int i:arr){
            System.out.print(i+"\t");
        }
        System.out.println();

        arr = bubbleSort(arr);

        for (int i:arr){
            System.out.print(i+"\t");
        }
    }

    public static int[] bubbleSort(int []arr){
        int temp;

        for (int i=0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-1-i ;j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
