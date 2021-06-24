package com.company.Searching;

import javax.swing.*;

public class RotateArray {
    public static void main(String[] args) {
        int []arr = {100,200,500,1000,2000,10,20};
        int target = 100;

        int []arr2 = {100,200,500,1000,2000,10,20};
        int target2 = 20;

        int []arr3 = {100,500,10,20,30,40,50};
        int target3 = 40;

        int []arr4 = {100,500,10,20,30,40,50};
        int target4 = 500;

        int []arr5 = {100,500,300,400,20,30,40};
        int target5 = 50;

        System.out.println(linearSearch(arr5, target5));
        System.out.println(binarySearch(arr5, target5));
    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;

        while (low<= high){
            int mid = (low + high) /2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[low] < arr[mid]){
                if (target >= arr[low] && target<arr[mid]){
                    high = mid -1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if (target > arr[mid] && target<=arr[high]) {
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return -1;

    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
