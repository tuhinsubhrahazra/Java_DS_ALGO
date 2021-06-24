package com.company.Matrix;

public class rotateMatrix90 {
    public static void main(String[] args) {
        int [][]arr = {{4,3,4,6},
                       {1,5,2,9},
                       {6,8,2,0},
                       {0,9,2,7}};

        printArray(arr);
        rotate(arr);
        printArray(arr);
    }

    private static void printArray(int[][] arr) {
        for (int i =0 ;i< arr.length;i++){
            for (int j =0; j<arr[i].length;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void rotate(int[][] arr) {
        // last column sould be frist row
        int n = arr.length;
        int [][]temp = new int[n][n];
        for (int i =0;i<n;i++){
            for (int j=0;j<n;j++){
                temp[i][j] = arr[j][(n-1)-i];
            }
        }

        for (int i = 0 ; i<n;i++){
            for (int j=0; j<n;j++){
                arr[i][j] = temp[i][j];
            }
        }

    }
}
