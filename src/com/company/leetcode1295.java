package com.company;

public class leetcode1295 {
    public static void main(String[] args) {
        int []nums = {12,345,2,6,7896};
        int n =  findNumbers(nums);
        int n2 =  findNum(nums);
        System.out.println(n2);
    }

    private static int findNum(int[] nums) {
        int count =0;
        for (int i:nums){
            int j =1;
            int size =0;
            int k =i;
            while (k!=0){
                j = j*10;
                k=i/j;
                size++;
            }
            if (size %2 == 0){
                count++;
            }
        }

        return count;
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i:nums){
            String s = String.valueOf(i);
            int size = s.length();
            if (size%2 == 0){
                count++;
            }
        }

        return count;
    }
}
