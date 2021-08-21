package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class JavelinQualification_Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;

        if (sc.hasNextInt()) {
            t = sc.nextInt();
        }
        while (t--!=0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();

            int []arr = new int[n];
            for (int i =0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            ArrayList<Integer> ids = new ArrayList<>();
            //Step 1
            for (int i =0;i<n;i++){
                if (arr[i] >= m){
                    ids.add(i+1);
                    x--;
                    arr[i] = Integer.MIN_VALUE;
                }
            }

            //Step 2

            for (int xi =1;xi<=x;xi++){
                int i=0;
                int max = Integer.MIN_VALUE;
                for (int j =0;j<n;j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                        i = j;
                    }
                }
                ids.add(i+1);
                arr[i] = Integer.MIN_VALUE;
            }

            Collections.sort(ids);

            System.out.print(ids.size()+"  ");
            for (int v:ids){
                System.out.print(v+"  ");
            }
            System.out.println();

        }
    }
}
