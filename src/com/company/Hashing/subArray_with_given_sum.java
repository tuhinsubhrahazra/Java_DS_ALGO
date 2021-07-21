package com.company.Hashing;

import java.util.HashSet;

public class subArray_with_given_sum {
    public static void main(String[] args) {
        int []arr1 = {5,8,6,13,3,-1};
        int sum1 = 22;
        int []arr2 = {15,2,8,10,-5,-8,6};
        int sum2 = 20;
        int []arr3 = {3,2,5,6};
        int sum3 = 10;

//        System.out.println(naiveSolution(arr1,sum1));
//        System.out.println(naiveSolution(arr2,sum2));
//        System.out.println(naiveSolution(arr3,sum3));
//        System.out.println();
        System.out.println(optimizedSolution(arr1,sum1));
        System.out.println(optimizedSolution(arr2,sum2));
        System.out.println(optimizedSolution(arr3,sum3));
    }

    private static boolean optimizedSolution(int[] arr, int sum) {
        HashSet<Integer> hashSet = new HashSet<>();
        int s =0;
        for (int i =0;i<arr.length;i++){
            s += sum;
            if (s == sum){
                return true;
            }
            if (hashSet.contains(sum)){
                return true;
            }
            hashSet.add(s);
        }
        return false;
    }

    private static boolean naiveSolution(int[] arr1, int sum1) {
        for (int i =0;i<arr1.length;i++){
            int s =0;
            for (int j = i;j< arr1.length;j++){
                s = s + arr1[j];
                if (s == sum1){
                    return true;
                }
            }
        }

        return false;
    }
}
