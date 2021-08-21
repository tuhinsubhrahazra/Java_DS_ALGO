package com.company;

import java.util.Scanner;

public class WhosOpposite_Codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = 0;

        if (sc.hasNextInt()) {
            test = sc.nextInt();
        }

        while (test--!=0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int min = Math.min(a,b);
            int max = Math.max(a,b);

            if (c>min && c<max){
                int diff = c-min;
                System.out.println(max+diff);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
