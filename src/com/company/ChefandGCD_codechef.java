package com.company;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.LongStream;


public class ChefandGCD_codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;

        if (sc.hasNextInt()) {
            t = sc.nextInt();
        }
        while (t--!=0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == 1 && y ==1){
                System.out.println(2);
            }
            else{
                if (x % 2 != 0 && y % 2 != 0)
                {
                    if (gcdThing(x,y) > 1)
                        System.out.println(0);
                    else
                    {
                        if (gcdThing(x+1,y)>1)
                            System.out.println(1);
                        else if (gcdThing(x, y + 1) > 1)
                            System.out.println(1);
                        else if (gcdThing(x + 1, y + 1) > 1)
                            System.out.println(2);
                    }
                }
                else if ((x % 2 == 0 && y % 2 != 0) || (x % 2 != 0 && y % 2 == 0))
                {
                    System.out.println(1);
                }
                else if (x % 2 == 0 && y % 2 == 0)
                {
                    System.out.println(0);
                }
            }
        }
    }

    private static int gcdThing(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }
}
