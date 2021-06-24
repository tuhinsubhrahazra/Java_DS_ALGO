package com.company.Searching;

public class count1sInSortedArray {
    public static void main(String[] args) {
        int []arr = {0,0,0,1,1,1,1,1,1,1};
        int []arr2 = {1,1,1,1,1,1,1};

        System.out.println(linearCount(arr));
        System.out.println(binaryCount(arr));
        System.out.println(linearCount(arr2));
        System.out.println(binaryCount(arr2));
    }

    private static int binaryCount(int[] arr) {
        int low = 0;
        int high = arr.length-1;

        while (low<=high){
            int mid = (low+high)/2;

            if (arr[mid] == 1){
                if (mid == 0 ||arr[mid - 1] == 0){
                    return arr.length - mid;
                }
                else{
                    high = mid-1;
                }
            }
            else if(arr[mid] < 1){
                low = mid +1 ;
            }
            else{
                high = mid -1;
            }
        }

        return 0;
    }

    private static int linearCount(int[] arr) {
        for (int i=0;i<arr.length;i++){
            if (arr[i] == 1){
                return arr.length - i;
            }
        }
        return 0;
    }


}
