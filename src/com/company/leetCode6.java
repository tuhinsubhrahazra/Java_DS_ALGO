package com.company;

import java.util.ArrayList;

public class leetCode6 {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,4,3,2,1};
        int n = 4;

        int []x = new int[nums.length];
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i=0;i<n;i++){
            arrayList.add(nums[i]);
            arrayList.add(nums[i+n]);
        }

        for (int i=0;i<arrayList.size();i++){
            x[i] = arrayList.get(i);
        }

        System.out.println(arrayList);

    }
}
