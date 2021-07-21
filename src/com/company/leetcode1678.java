package com.company;

import java.util.ArrayList;

public class leetcode1678 {
    public static void main(String[] args) {
        String com = "G()(al)";

        com = interpret(com);
        System.out.println(com);

    }

    public static String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
