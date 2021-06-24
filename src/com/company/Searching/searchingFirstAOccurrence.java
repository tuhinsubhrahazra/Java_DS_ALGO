package com.company.Searching;

public class searchingFirstAOccurrence {
    public static void main(String[] args) {
        System.out.println("hello");
        int []arr = {2,4,6,7,7,7,7,9,23,45};
        int []arr2 ={5,5,5,5,5};
        int target2 = 5;
        int target = 7;

        System.out.println(linearSearch(arr2,target2));
        System.out.println(binarySearch(arr2,target2));

    }

    public static int linearSearch(int []arr,int target){
        for (int i=0;i< arr.length;i++){
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int []arr,int target){ // 1,2 3,4,5,6,7,8
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if (arr[mid] == target){
                if (mid == 0 || arr[mid] != arr[mid-1]){
                    return mid;
                }
                else {
                    high = mid-1;
                }
            }
            else if (arr[mid] < target){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;
    }
}
