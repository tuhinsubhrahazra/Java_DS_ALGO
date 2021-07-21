package com.company;

import java.util.Scanner;

public class codechef_HTML_Tags {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t ;
        t = sc.nextInt();
        while (t-- > 0){
            String str = sc.next();
            if (str.charAt(0) == '<' && str.charAt(1) == '/' && str.charAt(str.length()-1) == '>'){
                boolean bool = false;
                for (int i =2;i<str.length()-1;i++){
                    int n = (int)str.charAt(i);
                    if ((n >= 97 && n <= 122) || (n >= 48 && n <= 57)){
                        bool = true;
                    }
                    else {
                        bool = false;
                    }
                }
                if (bool)
                    System.out.println("Success");
                else
                    System.out.println("Error");
            }
            else {
                System.out.println("Error");
            }
        }
    }
}
