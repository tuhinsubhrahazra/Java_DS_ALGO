package com.company;

import java.util.Scanner;

public class codechefRelativity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        if(sc.hasNextInt()) {
            t = sc.nextInt();
        }

        while (t--!= 0){
            int g = sc.nextInt();
            int c = sc.nextInt();

            int h = (c*c)/(2*g);

            System.out.println(h);
        }
    }
}
