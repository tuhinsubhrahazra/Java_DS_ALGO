package com.company.Hashing;

import java.util.HashSet;

public class subarray_with_zero_sum {
    public static void main(String[] args) {
        int []arr = {1,4,13,-3,-10,5};
        int []arr2 = {-1,4,-3,5,1};
        int []arr3 = {3,1,-2,5,6};
        int []arr4 = {5,6,0,8};

        System.out.println(naiveSolution(arr));
        System.out.println(naiveSolution(arr2));
        System.out.println(naiveSolution(arr3));
        System.out.println(naiveSolution(arr4));

        System.out.println();

        System.out.println(efficientSolution(arr));
        System.out.println(efficientSolution(arr2));
        System.out.println(efficientSolution(arr3));
        System.out.println(efficientSolution(arr4));


    }

    private static boolean efficientSolution(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        int prefix_sum =0;
        for (int i =0;i<arr.length;i++){
            prefix_sum+=arr[i];
            if (hashSet.contains(prefix_sum)){
                return true;
            }
            if (prefix_sum == 0){
                return true;
            }
            hashSet.add(prefix_sum);
        }
        return false;
    }

    private static boolean naiveSolution(int[] arr) {
        for (int i=0;i<arr.length;i++){
            int sum = arr[i];
            for (int j =i+1;j< arr.length;j++){
                if (sum == 0){
                    return true;
                }
                sum = sum + arr[j];
            }

        }
        return false;
    }
}
