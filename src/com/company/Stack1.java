package com.company;

import com.company.infix_to_postfix.charec;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<charec> ope = new Stack<>();

        for (int i=0; i<3;i++) {
            charec charec = new charec('g', i);
            ope.push(charec);
        }

        for (int i=0; i<3;i++) {
            charec charec = ope.get(i);
            System.out.println(charec.getC() +" "+ charec.getP());
        }
    }
}
