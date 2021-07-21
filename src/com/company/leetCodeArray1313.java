package com.company;

import java.util.ArrayList;

public class leetCodeArray1313 {
    public static void main(String[] args) {
        int []nums = {1,2,3,4};

        nums = decompressRLElist(nums);

        for (int i: nums){
            System.out.println(i);
        }
    }

//    private static int[] decompressRLElist_optimize(int[] nums) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 1;i<nums.length;i+=2){
//            arrayList.add(nums[i]);
//        }
//        for (int i =0;)
//
//        System.out.println(arrayList);
//        return new int[0];
//    }

    private static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0;i<nums.length;i+=2){
            for (int j=0;j<nums[i];j++){
                arrayList.add(nums[i+1]);
            }
        }

        int []arr = new int[arrayList.size()];

        for (int i=0;i<arrayList.size();i++){
            arr[i] = arrayList.get(i);
        }

        return arr;
    }
}
