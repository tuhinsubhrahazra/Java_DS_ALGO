package com.company.Hashing;

import java.util.HashSet;

public class LongestSubArraysWithGivenSum {
    public static void main(String[] args) {
        int []arr = {5,8,-4,-4,9,-2,2};
        int sum = 0;
        int []arr2 = {3,1,0,1,8,2,3,6};
        int sum2 = 5;
        int []arr3 = {8,3,7};
        int sum3 = 15;

        System.out.println(naiveSolution(arr,sum));
        System.out.println(naiveSolution(arr2,sum2));
        System.out.println(naiveSolution(arr3,sum3));

//        System.out.println(optimizeSolution(arr,sum));

    }

//    private static int optimizeSolution(int[] arr, int sum) {
//        int count =0;
//        HashSet<Integer> hashSet = new HashSet<>();
//        for (int i =0;i<arr.length;i++){
//            if (hashSet.contains(arr[i])){
//                return count;
//            }
//        }
//    }

    private static int naiveSolution(int[] arr,int sum) {
        int count = 0;
        for (int i =0;i<arr.length;i++){
            int s =arr[i];
            int c = 1;
            boolean isSum =false;
            for (int j =i+1;j<arr.length;j++){
                s+=arr[j];
                c++;
                if (s == sum){
                    isSum = true;
                    break;
                }
            }

            if (isSum && c>count){
                count = c;
            }
        }

        return count;
    }
}
