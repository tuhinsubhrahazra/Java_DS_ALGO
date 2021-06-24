package com.company;

import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        System.out.println("hello");
       stack.push(1);
       stack.push(2);
       stack.push(3);
       stack.push(4);
       stack.push(5);
       stack.push(6);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());

    }

}