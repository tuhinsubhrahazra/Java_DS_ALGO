package com.company;

import java.util.Scanner;

public class MaximumArrayXor_codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;

        if (sc.hasNextInt()) {
            t = sc.nextInt();
        }
        while (t--!=0){
            long N = sc.nextInt();
            long K = sc.nextInt();
            long temp;
            long s = (1L << N);
            if (K <= s/2){
                temp = ((s-1)*2)*K;
                System.out.println(temp);
            }
            else{
                K = s/2;
                temp = ((s-1)*2)*K;
                System.out.println(temp);
            }
        }
    }
}
