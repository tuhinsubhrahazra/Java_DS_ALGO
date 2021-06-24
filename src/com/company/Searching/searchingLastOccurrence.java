package com.company.Searching;

public class searchingLastOccurrence {
    public static void main(String[] args) {
        int []arr = {2,4,6,7,7,7,7,9,23,45};
        int []arr2 ={5,5,5,5,5};
        int target = 7;
        int target2 = 5;

        System.out.println(linearSearch(arr,target));
        System.out.println(linearSearch(arr2,target2));
        System.out.println(binarySearch(arr,target));
        System.out.println(binarySearch(arr2,target2));
    }

    public static int linearSearch(int []arr,int target){
        for (int i=arr.length-1; i>=0;i--){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int []arr, int target){
        int low = 0;
        int high = arr.length -1;
        while (low<=high){
            int mid = (low + high)/2;

            if (arr[mid] == target){
                if (mid == arr.length-1 || arr[mid] != arr[mid+1]) {
                    return mid;
                }
                else {
                    low = mid +1;
                }
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else {
                high = mid -1;
            }
        }
        return -1;
    }
}
