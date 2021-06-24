package com.company.Searching;

public class insertionSort {
    public static void main(String[] args) {
        int []arr = {5,7,2,4,9,11,45};

        arr = solution(arr);

        for (int i:arr){
            System.out.println(i);
        }
    }

    private static int[] solution(int[] arr) {
        int key;
        int j;
        for (int i = 1; i< arr.length;i++){
            key = arr[i];
            j = i-1;
            while( j>=0 && arr[j] > key ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        return arr;
    }
}
