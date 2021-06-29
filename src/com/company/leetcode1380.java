package com.company;

import java.util.ArrayList;
import java.util.List;

public class leetcode1380 {
    public static void main(String[] args) {
        int [][]arr =  {{56216},{63251},{75772},{1945},{27014}};

        List<Integer> arrayList = luckyNumbers(arr);
        System.out.println(arrayList);
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        int value = 0;
        for (int i =0;i<matrix.length;i++){
            int p = matrix[i][0];
            for (int j = 0;j<matrix[i].length;j++){
                p = Math.min(p,matrix[i][j]);

            }
            int point = 0;
            for (int k = 0;k<matrix[i].length;k++){
                if (matrix[i][k] == p){
                    point = k;
                    break;
                }
            }
            int max  = matrix[0][point];
            for (int k = 0; k<matrix.length;k++){
                max = Math.max(max,matrix[k][point]);
            }
            if (max == p){
                arrayList.add(p);
            }

        }

        return arrayList;
    }
}
