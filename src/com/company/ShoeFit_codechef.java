package com.company;

import java.util.Scanner;

public class ShoeFit_codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;

        if (sc.hasNextInt()) {
            t = sc.nextInt();
        }
        while (t--!=0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int ans = 0;

            if (A == 1){
                if (B == 0 || C == 0){
                    ans = 1;
                }
            }
            if (B==1){
                if (C == 0 || A == 0){
                    ans = 1;
                }
            }
            if (C ==1){
                if (A == 0 || B == 0){
                    ans = 1;
                }
            }

            System.out.println(ans);
        }
    }
}
