package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class leetcode349 {
    public static void main(String[] args) {
        int []arr1 = {1,2,2,1};
        int []arr2 = {2,2};

        int []arr = intersection(arr1,arr2);

        for (int i: arr){
            System.out.println(i);
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i:nums1){
            hashSet.add(i);
        }

        for (int i:nums2){
            if (hashSet.contains(i)){
                arrayList.add(i);
                hashSet.remove(i);
            }
        }

        int []arr = new int[arrayList.size()];
        int k =0;
        for (int i: arrayList){
            arr[k] = i;
            k++;
        }

        return arr;
    }
}
