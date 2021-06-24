package com.company.Sorting;

public class countInversionInAnArray {
    public static void main(String[] args) {
        int []arr = {2,4,1,3,5};

        int []arr2 = {2,5,8,11,3,6,9,13};

        niveSolution(arr);

        int n = optimizeSolution(arr,0, arr.length -1 );
        System.out.println(n);
    }

    private static int optimizeSolution(int[] arr , int low , int high) {
        int result = 0;

        if (low < high) {
            int mid = (low + high) / 2;
            result += optimizeSolution(arr,low,mid);
            result += optimizeSolution(arr,mid +1,high);
            result += countAndMarge(arr,low,mid,high);

        }

        return result;
    }

    private static void niveSolution(int[] arr) {
        int count = 0;
        for (int i=0; i<arr.length;i++){
            for (int j = i;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    count ++;
                }
            }
        }

        System.out.println(count);
    }

    private static int countAndMarge(int[] arr, int low, int mid, int high){
        int n1 = (mid - low) + 1;
        int n2 = (high - mid);

        int []left = new int[n1];
        int []right = new int[n2];

        for (int i =0;i<n1;i++){
            left[i] = arr[i+low];
        }

        for (int j =0; j<n2;j++){
            right[j] = arr[j + 1 + mid];
        }

        int i =0;
        int j = 0;
        int k = low;
        int result = 0;

        while (i<n1 && j<n2){
            if (left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
                result = result +(n1 - i);
            }
            k++;
        }
        while (i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k] = right[j];
            j++;
            k++;
        }

        return result;
    }
}
