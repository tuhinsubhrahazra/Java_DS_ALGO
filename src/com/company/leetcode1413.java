package com.company;

public class leetcode1413 {
    public static void main(String[] args) {
        int []nums = {1,-2,-3};

        int n = minStartValue(nums);

        System.out.println(n);
    }

    public static int minStartValue(int[] nums) {
        int n = 1;

        int temp =0;
        for (int i=1;i<nums.length;i++){
            nums[i] = nums[i] + temp;
            temp = nums[i-1];
        }

        for (int i:nums){
            System.out.println(i);
        }

        for (int i =0;i<nums.length;i++){
            
        }

        return n;
    }
}
