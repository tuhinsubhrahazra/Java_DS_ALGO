package com.company.Hashing;

import java.util.HashSet;

public class Pair_elements_in_unsorted_array {
    public static void main(String[] args) {
        int []arr = {5,8,-3,6};
        int sum = 3;

        System.out.println(naiveSolution(arr,sum));
        System.out.println(efficientSolution(arr,sum));
    }

    private static boolean efficientSolution(int[] arr, int sum) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i =0;i<arr.length;i++){
            if (hashSet.contains(sum - arr[i])){
                return true;
            }
            else{
                hashSet.add(arr[i]);
            }
        }
        return false;
    }

    private static boolean naiveSolution(int[] arr, int sum) {
        for (int i =0;i<arr.length;i++){
            for (int j = i+1;j< arr.length;j++){
                if (arr[i]+arr[j] == sum){
                    return true;
                }
            }
        }
        return false;
    }
}
