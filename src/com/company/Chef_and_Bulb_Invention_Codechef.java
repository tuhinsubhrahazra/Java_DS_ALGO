package com.company;

import java.util.Scanner;

public class Chef_and_Bulb_Invention_Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        if(sc.hasNextInt()) {
            t = sc.nextInt();
        }

        while (t--!= 0){
            long n = sc.nextInt();
            long p = sc.nextInt();
            long k = sc.nextInt();

            long r = p % k;
            long c = (p - r) / k;
            long y = n / k;
            if (n % k == 0)
            {
                long maxColum = ((n - 1) - ((n - 1) % k)) / k + 1;
                System.out.println((r * maxColum) + c + 1);
            }
            else {
                long maxColum1 = ((n - 1) - ((n - 1) % k)) / k ;
                if (r <= (n % k))
                    System.out.println((y * r) + c + ((maxColum1 + 1 - y) * r) + 1);
                else if (r > (n % k))
                    System.out.println((y * r) + c + ((maxColum1 + 1 - y) * r) + 1 - (r - (n % k)));
            }
        }
    }
}
