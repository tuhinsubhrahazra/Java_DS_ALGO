package com.company;

public class leetcode1365 {
    public static void main(String[] args) {
        int []nums = {6,5,4,8};

        int []arr = smallerNumbersThanCurrent(nums);

        for (int i:arr){
            System.out.println(i);
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int []tempArr = new int[nums.length];
        int k =0;
        for (int i=0;i<nums.length;i++){
            int count =0;
            for (int j =0;j<nums.length;j++){
                if (nums[i]>nums[j]) {
                    count++;
                }
            }
            tempArr[k] = count;
            k++;
        }

        return tempArr;
    }
}
