package com.company;

import java.util.Arrays;

public class leetcode191 {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;

        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        String num = Integer.toBinaryString(n);

        System.out.println(num);
        System.out.println();

        char []chars = num.toCharArray();

        Arrays.sort(chars);

        int low =0;
        int high = chars.length -1;

        while (low<=high){
            int mid = (low + high)/2;
            int value = Integer.parseInt(String.valueOf(chars[mid]));
            if ( value == 1){
                if (mid == 0 || chars[mid] != chars[mid-1]){
                    return chars.length - mid;
                }
                else {
                    high = mid-1;
                }
            }
            else if (value < 1){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }

        return 0;
    }
}
