package com.company;

import java.util.Scanner;

public class codechef_Chef_and_Spells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        if(sc.hasNextInt()) {
            t = sc.nextInt();
        }

        while (t--!= 0){
            long A = sc.nextInt();
            long B = sc.nextInt();
            long C = sc.nextInt();

            long sum1 = A+B;
            long sum2 = B+C;
            long sum3 = C+A;

            System.out.println(Math.max(Math.max(sum1,sum2),sum3));


//            if (A > B && A > C){
//                System.out.println(A + Math.max(B,C));
//            }
//            if (B > A && B > C){
//                System.out.println(B + Math.max(A,C));
//            }
//            if (C > B && C > A){
//                System.out.println(C + Math.max(A,B));
//            }
        }
    }
}
