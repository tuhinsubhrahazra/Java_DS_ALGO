package com.company;

import java.util.Scanner;

public class chess_format_codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;

        if (sc.hasNextInt()) {
            t = sc.nextInt();
        }
        while (t--!=0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a+b<3){
                System.out.println(1);
            }
            if (3<=a+b && a+b<=10){
                System.out.println(2);
            }
            if (11<=a+b && a+b<=60){
                System.out.println(3);
            }
            if (60<a+b){
                System.out.println(4);
            }
        }

    }
}
