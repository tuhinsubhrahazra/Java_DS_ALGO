package com.company;

import java.util.Scanner;

public class DislikeofThrees_Codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = 0;

        if (sc.hasNextInt()) {
            test = sc.nextInt();
        }

        while (test--!=0){
            int t = sc.nextInt();
            int i =0;
            int ans =1;

            while (t>0){
                i++;
                String s = Integer.toString(i);
                char c = s.charAt(s.length()-1);
                if (i%3 != 0 && c !='3'){
                    ans = i;
                    t--;
                }
            }

            System.out.println(ans);
        }
    }
}
