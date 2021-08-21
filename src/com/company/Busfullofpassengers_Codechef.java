package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Busfullofpassengers_Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;

        if (sc.hasNextInt()) {
            t = sc.nextInt();
        }
        while (t--!=0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int q = sc.nextInt();

            int count =0;
            boolean []visited = new boolean[n];
            boolean []bus = new boolean[n];

            int []array = new int[q];
            char []sine = new char[q];

            for (int i=0;i<q;i++){
                char ch = sc.next().charAt(0);
                int input = sc.nextInt();
                array[i] = input;
                sine[i] = ch;
            }

            boolean inconsistent = false;

            for (int b=0;b<q;b++){
                char ch = sine[b];
                int input = array[b];
                if (ch == '-'){
                    //delete
                    if (!bus[input-1]){
                        System.out.println("Inconsistent");
//                        System.out.println("p1");
                        inconsistent = true;
                        break;
                    }
                    else if (bus[input-1]){
                        bus[input-1] = false;
                        count--;
                    }
                }
                else{
                    //insert
                    if (count<m) {
                        if (!visited[input-1]) {
                            if (bus[input-1]) {
                                System.out.println("Inconsistent");
//                                System.out.println("p2");
                                inconsistent = true;
                                break;

                            } else {
                                bus[input-1] = true;
                                count++;
                            }
                        }
                    }
                    else {
                        System.out.println("Inconsistent");
//                        System.out.println("p3");
                        inconsistent = true;
                        break;
                    }
                }
            }

            if (!inconsistent){
                System.out.println("Consistent");
            }
        }
    }
}
