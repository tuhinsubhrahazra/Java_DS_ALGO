package com.company;

public class leetcode1572 {
    public static void main(String[] args) {
        int [][]mat = {{1,1,1,1},
                       {1,1,1,1},
                       {1,1,1,1},
                       {1,1,1,1}};

        int sum = diagonalSum(mat);
        System.out.println(sum);
    }

    public static int diagonalSum(int[][] mat) {
        int sum =0;
        int k=0;
        for (int i =0;i<mat.length;i++){
            if (k == mat[i].length - 1- k) {
                sum = sum+mat[i][k];
            }
            else{
                int s = mat[i][k] + mat[i][mat.length - 1 - k];
                sum = sum + s;
            }
            k++;
        }

        return sum;
    }
}
