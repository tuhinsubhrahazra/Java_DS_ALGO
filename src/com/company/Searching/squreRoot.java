package com.company.Searching;

public class squreRoot {
    public static void main(String[] args) {
        int x = 24;

        System.out.println(linearSearchAlgorithm(x));

        System.out.println(binarySearchAlgorithm(x));
    }

    private static int binarySearchAlgorithm(int x) {
        int low = 1;
        int high = x;
        int ans = -1;

        while(low <= high){
            int mid = ( low + high )/2;

            if (mid*mid == x){
                ans = mid ;
            }
            else if(mid*mid > x){
                high = mid -1;
            }
            else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static int linearSearchAlgorithm(int x){
        int i=1;
        while (i*i <= x){
            i++;
        }
        return i-1;

    }
}
