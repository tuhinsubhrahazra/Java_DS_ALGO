package com.company;

import java.util.Scanner;

public class CeilingSum_codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;

        if (sc.hasNextInt()) {
            t = sc.nextInt();
        }
        while (t--!=0){
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A == B){
                System.out.println(0);
            }
            else {
                int x = Math.min(A, B);
                int y = x +1;
                int sum1 = (int) (Math.ceil((B - x) / 2.0) + Math.ceil((x - A) / 2.0));
                int sum2 = (int) (Math.ceil((B - y) / 2.0) + Math.ceil((y - A) / 2.0));

                System.out.println(Math.max(sum1, sum2));
            }

        }
    }
}
