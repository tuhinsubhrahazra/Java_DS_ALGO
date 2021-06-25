package com.company;

public class leetcode1512 {
    public static void main(String[] args) {
        int []nums = {1,1,1,1};

        int n = numIdenticalPairs(nums);
        System.out.println(n);
    }

    public static int numIdenticalPairs(int[] nums) {
        int count =0;
        for (int i =0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i] == nums[j]){
                    count ++;
                }
            }
        }

        return count;
    }
}
