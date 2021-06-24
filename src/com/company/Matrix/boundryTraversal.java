package com.company.Matrix;

public class boundryTraversal {
    public static void main(String[] args) {
        int [][]arr = {{4,3,5,1,7,9,},
                       {9,5,0,4,8,2},
                       {2,6,3,4,5,1},
                       {9,8,3,0,4,6}};

        for (int i =0 ;i< arr.length;i++){
            for (int j =0; j<arr[i].length;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        printBoundryItem(arr);
    }

    private static void printBoundryItem(int[][] arr) {
        System.out.println();
        for (int i =0;i<arr[0].length;i++){
            System.out.print(arr[0][i]+"  ");
        }

        for (int i = 1; i< arr.length; i++){
            int length = arr[i].length;
            System.out.print(arr[i][length-1] + "  ");
        }

        for (int i = arr[arr.length-1].length - 2 ; i >= 0 ;i--){
            System.out.print(arr[arr.length-1][i] + "  ");
        }

        for (int i = arr.length - 2 ; i > 0 ;i--){
            System.out.print(arr[i][0] + "  ");
        }
    }
}
