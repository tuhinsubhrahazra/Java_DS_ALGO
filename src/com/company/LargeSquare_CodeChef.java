package com.company;

import java.util.Scanner;

public class LargeSquare_CodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;

        if (sc.hasNextInt()) {
            t = sc.nextInt();
        }
        while (t--!=0){
            int n = sc.nextInt();
            int a = sc.nextInt();

            int v=0;
            for (int i=1;i<=n;i++){
                double pow = Math.pow(i,2);
                if (pow > n){
                    break;
                }
                v=i;
            }
            System.out.println(v*a);
        }
    }
}
