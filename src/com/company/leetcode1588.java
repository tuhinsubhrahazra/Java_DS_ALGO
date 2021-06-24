package com.company;

public class leetcode1588 {
    public static void main(String[] args) {
        int []arr = {1,4,2,5,3};
        int sum = sumOddLengthSubarrays(arr);

        System.out.println(sum);
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int count =0;
        for (int i =1;i<=arr.length;i+=2){
            for (int j=0;j<arr.length;j++){
                for (int k =0; k<i;k++){
//                    count
                }
            }
            System.out.println();
        }
        return count;
    }
}
