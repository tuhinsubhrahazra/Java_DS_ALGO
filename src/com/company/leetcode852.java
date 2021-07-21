package com.company;

public class leetcode852 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};

        int n = peakIndexInMountainArray(arr);
        int n2 = peakIndexInMountainArrayOptimized(arr);
        System.out.println(n);
        System.out.println(n2);
    }

    public static int peakIndexInMountainArrayOptimized(int[] arr) {
        int low = 0;
        int high = arr.length-1;

        while (low < high){
            int mid = (low + high)/2;
            if (arr[mid+1]>arr[mid]){
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }

        return low;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length -1;
        while (low<=high){
            int mid = (low + high)/2;

            if ((mid == 0 || arr[mid] > arr[mid-1] )&& (mid == arr.length -1 || arr[mid] > arr[mid+1])){
                return mid;
            }
            else {
                if (mid > 0 && arr[mid]<arr[mid-1]){
                    high = mid -1;
                }
                else {
                    low = mid +1;
                }
            }
        }

        return 0;
    }
}
