package com.company;

import com.company.Heap.HeapSort;

public class temp {
    public static void main(String[] args) {
        int a = 1234;

        String s = String.valueOf(a);
        char []arr = new char[s.length()];
        for (int i=0;i<s.length();i++){
            arr[i] = s.charAt(i);
        }

        char max = arr[0];
        int maxi = (int) max;
        int min = (int) arr[0];

        System.out.println(maxi + "  " + min);


    }

}
