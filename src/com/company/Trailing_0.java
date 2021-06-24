package com.company;

import java.util.Scanner;

public class Trailing_0 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number :");
        int N = sc.nextInt();

        int count = 0;

        for(int i = 5; i<=N; i*=5){
            count = count + (N/i);
        }

        System.out.println("The trailing 0 of the number "+ N +" is "+count);
    }
}
