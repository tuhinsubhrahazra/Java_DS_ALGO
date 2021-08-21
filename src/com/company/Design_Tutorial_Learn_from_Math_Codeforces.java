package com.company;

import java.util.Scanner;

public class Design_Tutorial_Learn_from_Math_Codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int t;
        if (n%2 == 0){
            int h = n/2;
            if (h%2 !=0){
                t = n/2 -1;
            }
            else{
                t= n/2;
            }
        }
        else{
            t=9;
        }

        System.out.println(t);
        System.out.println(n-t);
    }
}
