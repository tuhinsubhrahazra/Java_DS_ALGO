package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ThreePoints_Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;

        if (sc.hasNextInt()) {
            t = sc.nextInt();
        }
        while (t--!=0){
            int x1 =sc.nextInt();
            int y1 =sc.nextInt();
            int x2 =sc.nextInt();
            int y2 =sc.nextInt();
            int x3 =sc.nextInt();
            int y3 =sc.nextInt();

            double AB = dis(x1,x2,y1,y2);
            double BC = dis(x2,x3,y2,y3);
            double AC = dis(x1,x3,y1,y3);

            System.out.println(Math.sqrt(AB));
            System.out.println(Math.sqrt(BC));
            System.out.println(Math.sqrt(AC));

            checkPoint(AB,BC,AC);

            if ((Math.sqrt(AB)*1.0) + Math.sqrt(BC) == Math.sqrt(AC)){
                System.out.println("YES");
            }
            else if (Math.sqrt(AB) + Math.sqrt(AC) == Math.sqrt(BC)){
                System.out.println("YES");
            }
            else if (Math.sqrt(AC) + Math.sqrt(BC) == Math.sqrt(AB)){
                System.out.println("YES");
            }
            else if (AB + BC == AC){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

    private static void checkPoint(double ab, double bc, double ac) {
    }

    private static double dis(int x1, int x2, int y1, int y2) {
        return ((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1));
    }
}
