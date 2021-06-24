package com.company;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;

public class leetcode10 {
    public static void main(String[] args) {
        int[][] mat ={{1,1,0,0,0},
                      {1,1,1,1,0},
                      {1,0,0,0,0},
                      {1,1,0,0,0},
                      {1,1,1,1,0}};

        int low =0;
        int high = 0;
        int []arr = new int[mat.length];

        for (int i =0; i<mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int mid = (low + high) / 2;

                if (mat[i][mid] == 1 && mat[i][mid + 1] == 0) {
                    int one = mid + 1;
                    if (one < mat[i].length - one) {
                        arr[i] = one;
                    }
                } else if (mat[i][mid] < 1) {
                    high = mid;

                }
                else {
                    low = mid;
                }
            }
        }

        for (int i:arr) {
            System.out.println(arr[i]);
        }
//            low = 0;
//            high = mat[i].length-1;
//            int mid = (low + high)/2;
//
//            if (mat[i][mid] == 1 && mat[i][mid+1] == 0){
//                 int one = mid+1;
//                 if (one < mat[i].length - one){
//                     arr[i] = one;
//                 }
//            }
//            else if(mat[i][mid] < 1){
//                high = mid-1;
//                mid = (low +high)/2;
//
//            }
//        }



//
//        int []arr = new int[mat.length];
//
//        int k = 0;
//        int i=0;
//        int []arr2 = new int[5];
//
//        int count =0;
//        while (i<mat.length){
//            if (mat[i][k] == 1){
//                count++;
//                arr[i] = count;
//                if (k >= mat[i].length-1){
//                    i++;
//                    k = 0;
//                    count =0;
//
//                }
//                else {
//                    k++;
//                }
//            }
//            else {
//                arr[i] =
//                i++;
//                k = 0;
//                count = 0;
//            }
//        }
//
//        for (int h : arr){
//            System.out.println(h);
//        }
//        int arr2[] = new int[mat.length];
//        int t = 0;
//
//        int temp = arr[0];
//        for(int h=0;h< arr.length;h++){
//            if (arr[h] < mat[h].length - arr[h]){
//                System.out.println("week");
//                if (arr[h] < temp){
//                    arr2[t] = h;
//                    h++;
//                    temp =
//                }
//            }
//        }

    }
}
