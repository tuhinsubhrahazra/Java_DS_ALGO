package com.company;

import java.util.Scanner;

public class PenaltyShots_Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;

        if (sc.hasNextInt()) {
            t = sc.nextInt();
        }
        while (t--!=0){
            int n =10;
            int []arr = new int[10];
            for (int i =0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int count1 =0;
            int count2 =0;
            for (int i=1;i<=n;i++){
                if (i%2 == 0){
                    if (arr[i-1] == 1){
                        count2++;
                    }
                }
                else{
                    if (arr[i-1] == 1){
                        count1++;
                    }
                }
            }

            if (count1>count2){
                System.out.println(1);
            }
            else if (count1<count2){
                System.out.println(2);
            }
            else{
                System.out.println(0);
            }
        }

    }
}
