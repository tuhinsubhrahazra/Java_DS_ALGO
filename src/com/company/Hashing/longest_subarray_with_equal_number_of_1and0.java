package com.company.Hashing;

import java.util.Arrays;

public class longest_subarray_with_equal_number_of_1and0 {
    public static void main(String[] args) {
        int []arr = {1,0,1,1,1,0,0};
        int []arr2 = {1,1,1,1};
        int []arr3 = {0,0,1,1,1,1,1,0};
        int []arr4 = {0,0,1,0,1,1};

        System.out.println(naiveSolution(arr));
        System.out.println(naiveSolution(arr2));
        System.out.println(naiveSolution(arr3));
        System.out.println(naiveSolution(arr4));
    }

    private static int naiveSolution(int[] arr) {
        int count = 0;
        for (int i=0;i<arr.length;i++){
            int count1 =0;
            int count0 =0;
            for (int j =i;j<arr.length;j++){
                if (arr[j] == 0){
                    count0++;
                }
                else {
                    count1++;
                }

                if(count0 == count1){
                    if (count<count0+count1){
                        count = count0+count1;
                    }
                }
            }
        }
        return count;
    }
}
