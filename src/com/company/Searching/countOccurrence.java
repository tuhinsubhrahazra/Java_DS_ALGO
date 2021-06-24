package com.company.Searching;

public class countOccurrence {
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

    public static int linearSearch(int []arr, int target){
        int st1 =0;
        int st2 =0;
        int i;
        for (i=0;i< arr.length;i++){
            if (arr[i] == target){
                st1 = i;
                break;
            }
        }

        for (int j = i;j< arr.length;j++){
            if (arr[j] == target){
                st2 = j;
            }
            else {
                break;
            }
        }

        return st2 - st1 +1;
    }

    public static int binarySearch(int []arr,int target){
        int st1 = searchingFirstAOccurrence.binarySearch(arr,target);
        int st2 = searchingLastOccurrence.binarySearch(arr,target);

        if (st1 == -1){
            return 0;
        }
        else {
            return st2 - st1 +1;
        }
    }
}
