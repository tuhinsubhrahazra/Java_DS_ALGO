package com.company;

import java.util.Scanner;

public class foodChain_codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;

        if (sc.hasNextInt()) {
            t = sc.nextInt();
        }
        while (t--!=0){
            float a = sc.nextInt();
            float b = sc.nextInt();
            int ans = 0;
            while(Math.floor(a / b) > 0){
                a = (int) Math.floor(a / b);
                ans++;
            }
            ans++;
            System.out.println(ans);
        }
    }
}
