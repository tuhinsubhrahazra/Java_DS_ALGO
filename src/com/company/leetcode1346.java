package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class leetcode1346 {
    public static void main(String[] args) {
        int []arr = {2,3,5,10};

        System.out.println(checkIfExist(arr));

        System.out.println(checkIfExistOptimized(arr));
    }

    private static boolean checkIfExistOptimized(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i =0;i<arr.length;i++){
            if (hashSet.contains(arr[i]*2) || ( arr[i]%2 == 0 && hashSet.contains(arr[i]/2))) {
                return true;
            }
            else {
                hashSet.add(arr[i]);
            }
        }
        return false;
    }

    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> arrayListN = new ArrayList<>();
        ArrayList<Integer> arrayListP = new ArrayList<>();

        for (int i =0;i<arr.length;i++){
            if (arr[i] < 0){
                arrayListN.add(arr[i]);
            }
            else{
                arrayListP.add(arr[i]);
            }
        }

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i =0;i<arrayListN.size();i++) {
            if (hashSet.contains(arrayListN.get(i) * 2)) {
                return true;
            } else {
                hashSet.add(arrayListN.get(i));
            }
        }

        for (int i = arrayListP.size() -1; i>=0;i--){
            if (hashSet.contains(arrayListP.get(i) * 2)){
                return true;
            }
            else {
                hashSet.add(arrayListP.get(i));
            }
        }

        return false;
    }
}
