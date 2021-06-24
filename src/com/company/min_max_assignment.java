package com.company;

public class min_max_assignment {
    public static int max =0;
    public static int min =0;

    public static void main(String[] args) {
        int []arr = {56,23,90,89,12,672,45,9,54,23, 101};

        int low = 0;
        int high = arr.length -1;
        getMax(arr,low,high);
        min = max;
        getMin(arr,low,high);
        System.out.println("The Maximum element of the array is : "+max);
        System.out.println("The Minimum element of the array is : "+min);

        MargeSort(arr,low,high);
        int mx = arr[arr.length-1];
        int mn = arr[0];
        System.out.println("The Maximum element of the array is : "+mx);
        System.out.println("The Minimum element of the array is : "+mn);

    }

    private static void MargeSort(int[] arr, int low, int high) {
        if (low<high){
            int mid = (low + high)/2;
            MargeSort(arr,low,mid);
            MargeSort(arr,mid+1,high);
            marge(arr,low,mid,high);
        }
    }

    private static void marge(int[] arr, int low,int mid, int high) {
        int n1 = (mid - low) + 1;
        int n2 = high - mid;

        int []num1 = new int[n1];
        int []num2 = new int[n2];

        for (int i = 0; i<n1;i++){
            num1[i] = arr[i+low];
        }
        for (int i= 0;i<n2;i++){
            num2[i] = arr[i+mid+1];
        }
        int i = 0;
        int j = 0;
        int k =low;

        while (i < n1 && j < n2) {
            if (num1[i] < num2[j]) {
                arr[k] = num1[i];
                i++;
            } else {
                arr[k] = num2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = num1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = num2[j];
            j++;
            k++;
        }
    }

    private static void getMin(int[] arr, int low, int high) {
        if (high>low) {
            int mid = (low + high) / 2;
            getMin(arr,low,mid);
            getMin(arr,mid+1,high);
            min = Math.min(min,Math.min(arr[low],arr[high]));
        }
    }

    private static void getMax(int[] arr,int low, int high) {
        if (high>low) {
            int mid = (low + high) / 2;
            getMax(arr,low,mid);
            getMax(arr,mid+1,high);
            max = Math.max(max,Math.max(arr[low],arr[high]));
        }
    }
}
