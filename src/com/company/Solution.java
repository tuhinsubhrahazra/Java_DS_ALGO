package com.company;

import java.util.Scanner;

public class Solution {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long f = 1;

        System.out.println("Enter the number : ");
        int N = sc.nextInt();

        for(int i= 1; i<=N ; i++){
            f = f*i;
        }
        System.out.println(f);
        long pc = f;

        int count = 0;

        while(true){
            long c = pc % 10;
            if(c == 0){
                count++;
                pc = pc/10;
            }
            else {
                break;
            }
        }

        System.out.println("Count of trailing : " + count);

    }
}
