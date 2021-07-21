package com.company;

public class leetcode367 {
    public static void main(String[] args) {
        int num = 2000105819;

        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        int low =0;
        int high =1;
        do {
            high = high * 2;
        } while (num > high * high);

        while (low<=high){
            int mid = (low +high)/2;
            if (mid*mid == num){
                return true;
            }
            else if (mid*mid<num){
                low = mid + 1;
            }
            else {
                high = mid-1;
            }
        }
        return false;
    }
}
