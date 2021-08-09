package com.company;

import java.util.Scanner;

public class OlympicsRanking_Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        if(sc.hasNextInt()) {
            t = sc.nextInt();
        }

        while (t--!= 0){
            int G1 = sc.nextInt();
            int S1 = sc.nextInt();
            int B1 = sc.nextInt();

            int G2 = sc.nextInt();
            int S2 = sc.nextInt();
            int B2 = sc.nextInt();

            int W1 = G1+S1+B1;
            int W2 = G2+S2+B2;

            if (W1 > W2){
                System.out.println(1);
            }
            else{
                System.out.println(2);
            }

        }
    }
}
