package com.company.Searching;

public class InfiniteSizedArray {
    public static void main(String[] args) {
        int []arr = {1,3,5,6,7,8,9,13,14,17,23,45,199,201,345,678,890,1101,4567};
        int target = 3;

        System.out.println(linearSearch(arr, target));
        System.out.println(binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = 0;
        if (arr[2]>target){
            high = 1;
        }
        else {
            high = 2;
        }
        while (true){
            if (arr[high] < target){
                high = high * high;
            }
            else{
                break;
            }
        }

        while (low<=high){
            int mid = (low + high)/2;
            if (arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }

        return -1;
    }

    private static int linearSearch(int[] arr ,int target) {
        int i = 0;
        while (true){
            if (arr[i] == target){
                return i;
            }
            i++;
        }
    }
}
