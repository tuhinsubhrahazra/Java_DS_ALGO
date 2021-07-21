package com.company.Hashing;

import java.util.HashSet;

public class Intersection_of_two_arrays {
    public static void main(String[] args) {
        int []arr1 = {2,5,7,7,9,6,3};
        int []arr2 = {12,45,7,19,6,3};

        int c = naiveSolution(arr1,arr2);
        System.out.println(c);
        int cu = efficientSolution(arr1,arr2);
        System.out.println(cu);
    }

    private static int efficientSolution(int[] arr1, int[] arr2) {
        int count =0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i =0;i<arr1.length;i++){
            hashSet.add(arr1[i]);
        }
        for (int i =0;i<arr2.length;i++){
            if (hashSet.contains(arr2[i])) {
                hashSet.remove(arr2[i]);
                count++;
            }
        }
        return count;
    }

    private static int naiveSolution(int[] arr1, int[] arr2) {
        int count =0;
        for (int i =0;i<arr1.length;i++){
            for (int j =0;j<arr2.length;j++){
                if (arr1[i] == arr2[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
