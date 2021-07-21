package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class leetcode888 {
    public static void main(String[] args) {
        int []arr1 = {1,1};
        int []arr2 = {2,2};

        int []arr = fairCandySwap(arr1,arr2);

        System.out.println();
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int difference = ((IntStream.of(aliceSizes).sum()) - (IntStream.of(bobSizes).sum())) /2;

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i: aliceSizes){
            hashSet.add(i);
        }

        for (int i:bobSizes){
            if (hashSet.contains(difference + i)){
                return new int[] {difference+i, i };
            }
        }

        return new int[0];
    }
}
