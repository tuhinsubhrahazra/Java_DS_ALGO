package com.company;

import java.util.Scanner;

public class codechefMaximumProduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0){
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int firstWay = 7*x;
            int secondWay = (d *y) + z*(7 - d);

            System.out.println(Math.max(firstWay,secondWay));
        }
    }
}
