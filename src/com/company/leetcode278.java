package com.company;

public class leetcode278 {
    public static void main(String[] args) {
//        int n = 5;
        int n = 2126753390;
//        1702766719

        System.out.println(firstBadVersion(n));

    }

    public static int firstBadVersion(int n) {
        int low = 1;
        int high = n;

        while (low<=high){
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)){
                if (mid == 0 || !isBadVersion(mid -1)){
                    return mid;
                }
                else {
                    high = mid-1;
                }
            }
            else {
                if (!isBadVersion(mid)) {
                    low = mid + 1;
                }
                else {
                    high = mid -1;
                }
            }
        }
        return 0;
    }

    public static boolean isBadVersion(int version){
        return version == 1702766719;
    }
}
