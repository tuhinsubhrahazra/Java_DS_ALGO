package com.company;

public class leetcode441 {
    public static void main(String[] args) {
        int n = 8;

        System.out.println(arrangeCoins(n));
    }

    public static int arrangeCoins(int n) {
        int count = 0;
        int k = 1;

        while(true){
            n = n-k;
            k++;
            if (n < 0){
                break;
            }
            else {
                count++;
            }
        }

        return count;
    }
}
