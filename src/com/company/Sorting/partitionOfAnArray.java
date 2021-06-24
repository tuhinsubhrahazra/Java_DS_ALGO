package com.company.Sorting;


public class partitionOfAnArray {
    public static void main(String[] args) {
        int []arr ={5,13,6,9,12,11,8};
        int low = 0;
        int pos = 6;
        int high = 6;

//        NaiveSolution(arr,low,pos,high);
//
//        for (int i:arr){
//            System.out.print(i+"  ");
//        }

        int []arr2 = {10,80,30,90,40,50,70};
        int low2 = 0;
        int high2 = 6;

        int []arr3 = {70,60,80,40,30};
        int low3 = 0;
        int high3 = 4;

        int []arr4 = {30,40,20,50,80};
        int low4 = 0;
        int high4 = 4;

//        int index = LomutoPartition(arr4,low4,high4);
//        System.out.println("The index is : " + index);

        int []arr5 = {5,3,8,4,2,7,1,10};
        int low5 = 0;
        int high5 = 7;

        int []arr6 = {3,13,18,14,12,17,11,10};
        int low6 = 0;
        int high6 = 7;

        int []arr7 = {15,3,8,4,2,7,1,10};
        int low7 = 0;
        int high7 = 7;

        int []arr8 = {5,5,5,5,5,5,5,5};
        // NOT STABLE
        int low8 = 0;
        int high8 = 7;

        int index = HoaresPartition(arr5,low5,high5);
        System.out.println("The index is : " + index);

        for (int i:arr5){
            System.out.print(i+"  ");
        }
    }

    private static int HoaresPartition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                return j;
            }

            Swap(arr, i, j);
        }

    }

    private static int LomutoPartition(int[] arr, int low, int high) {
        int pivot = arr[high];
//        if (pivot != arr[high]){
//
//        }
        int i = low -1;
        for (int j = low; j<=high -1; j++){
            if (arr[j] < pivot){
                i++;
                Swap(arr,j,i);
            }
        }

        Swap(arr, i + 1, high);

        return i+1;
    }

    private static void Swap(int []arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void NaiveSolution(int[] arr,int low,int pos,int high) {
        int []tempArr = new int[(high - low) + 1];
        int index = 0;

        for (int i = low; i<= high;i++){
            if (arr[i] <= arr[pos]){
                tempArr[index] = arr[i];
                index ++;
            }
        }

        for (int i = low;i<=high ;i++){
            if (arr[pos] < arr[i]){
                tempArr[index] = arr[i];
                index ++;
            }
        }

        for (int k = low ; k<= high; k++){
            arr[k] = tempArr[k - low];
        }
    }

}
