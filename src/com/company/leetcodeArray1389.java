package com.company;

import java.util.ArrayList;

public class leetcodeArray1389 {
    public static boolean repeat = false;
    public static void main(String[] args) {
        int []nums = {0,1,2,3,4};
        int []index = {0,1,2,2,1};

        createTargetArray(nums,index);

        for (int i:nums){
            System.out.println(i);
        }
    }

    private static void createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i=0;i< nums.length;i++){
            arrayList.add(index[i],nums[i]);
        }

        for (int i =0;i< arrayList.size();i++){
            nums[i] = arrayList.get(i);
        }
    }
}
