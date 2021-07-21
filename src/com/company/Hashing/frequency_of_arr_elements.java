package com.company.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class frequency_of_arr_elements {
    public static void main(String[] args) {
        int []arr = {10,12,10,15,10,20,12,12};

//        naiveSolution(arr);

        efficientSolution(arr);
    }

    private static void efficientSolution(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i =0; i<arr.length;i++){
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0) + 1);
        }
        for (Map.Entry<Integer, Integer> h : hashMap.entrySet()){
            System.out.println(h.getKey() + "  " + h.getValue());
        }
    }

    private static void naiveSolution(int[] arr) {
        int i = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (i != arr.length){
            int count = 0;
            for (int j =0;j< arr.length;j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (!arrayList.contains(arr[i])) {
                System.out.println(arr[i] + "  " + count);
                arrayList.add(arr[i]);
            }
            i++;
        }
    }
}
