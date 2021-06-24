package com.company;

public class leetCode5 {
    public static void main(String[] args) {
        int []nums = {1,2,3,4};

        int []arr = new int[nums.length];
        arr[0] = nums[0];

        for (int i = 1;i<nums.length;i++){
            int n = nums[i] + arr[i-1];
            arr[i] = n;
        }

        for (int i:arr){
            System.out.println(i);
        }
    }

}
