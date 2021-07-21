package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class StringProblem1 {
    public static void main(String[] args) {
        String s = "loveleetcode";

        int p = duplicate(s);
        System.out.println(p);
    }

    private static int duplicate(String s) {
        for (int i = 0;i<s.length();i++){
            for (int j =i+1;j<s.length();j++){
                if (s.charAt(i) == s.charAt(j)){
                    return i;
                }
            }
        }

        return -1;
    }
}
