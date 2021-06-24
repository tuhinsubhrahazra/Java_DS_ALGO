package com.company.Sorting;


public class intersectionOfTwoSortedArray {
    public static void main(String[] args) {
        int []arr1 = {1,20,20,40,60};
        int []arr2 = {2,20,20,20};

        niveSolution(arr1,arr2);

        optimizeSolution(arr1,arr2);
    }

    private static void optimizeSolution(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        while (i<arr1.length && j< arr2.length){

            if (i>0 && arr1[i] == arr1[i-1]){
                i++;
                continue;
            }
            if (arr1[i]< arr2[j]){
                i++;
            }
            else if (arr1[i]>arr2[j]){
                j++;
            }
            else{
                System.out.println(arr1[i] + "  ");
                i++;
                j++;
            }
        }
    }

    private static void niveSolution(int[] arr1, int[] arr2) {
        for (int i =0;i<arr1.length;i++){

            if (i>0 && arr1[i] == arr2[i-1]){
                continue;
            }

            for (int j=0;j<arr2.length;j++){
               if (arr1[i] == arr2[j]){
                   System.out.print(arr1[i] + "  ");
                   break;
               }
            }
        }
    }

}
