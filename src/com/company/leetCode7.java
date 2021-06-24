package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class leetCode7 {
    public static void main(String[] args) {
        int [][]accounts = {{1,2,3},
                            {3,2,1}};

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0;i<accounts.length;i++){
            int sum =0;
            for (int j=0;j<accounts[i].length;j++){
                 sum = sum + accounts[i][j];
            }
            arrayList.add(sum);
        }

        int largeVal = arrayList.get(0);
        for (int i=0;i<arrayList.size();i++){
            if (largeVal<arrayList.get(i)){
                largeVal = arrayList.get(i);
            }
        }

        System.out.println(largeVal);

    }
}
