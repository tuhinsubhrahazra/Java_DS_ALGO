package com.company.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Tuhin Subhra Hazra");
        System.out.println("Roll : IT/19/04");

        int []arr = {13,24,36,41,57,66,78,89,92,101};
         int target = 101;

         int n = binarySearch(arr,target);
        System.out.println("Index found at position :" + n);
    }

    public static int binarySearch(int []arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = (low+high)/2;

            if (arr[mid] == target){
                return mid;
            }
            else if(arr[mid]< target){
                low = mid +1;
            }
            else {
                high = high-1;
            }
        }
        return -1;
    }
}
