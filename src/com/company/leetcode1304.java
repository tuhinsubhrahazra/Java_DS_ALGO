package com.company;

public class leetcode1304 {
    public static void main(String[] args) {
        int n = 6;
        int []arr = sumZero(n);

        for (int i:arr){
            System.out.println(i);
        }
    }

    private static int[] sumZero(int n) {
        int []arr = new int[n];
        int k =0;

        for (int i=1;i<=n/2;i++){
            arr[k] = i;
            k++;
            arr[k] = -(i);
            k++;
        }

        if (!(n%2 == 0)) {
            arr[k] = 0;
        }

        return arr;
    }
}
