package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class ProblemDifficulties_CodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        if(sc.hasNextInt()) {
            t = sc.nextInt();
        }

        while (t--!= 0){

            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
            int a4 = sc.nextInt();

            if (a1 == a2 && a2 == a3 && a3 == a4){
                System.out.println(0);
            }
            else if ((a1 == a2 && a2 == a3) || (a1 == a3 && a3 == a4) ||
                    (a2 == a3 && a3 == a4) || (a1 == a2 && a2 == a4)){
                System.out.println(1);
            }
            else{
                System.out.println(2);
            }

        }
    }
}
