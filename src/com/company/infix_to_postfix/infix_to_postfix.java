package com.company.infix_to_postfix;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Stack;

public class infix_to_postfix {

    public static int y = -1;

    public static Stack<Character> operator = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[20];
        int k = 0;

//        System.out.println("Enter the Infix in String :");
//        String infix = sc.next();
//        String infix = "x-y/z-k*d";
        String infix = "x-y/z-k";

        for (int i=0;i<infix.length();i++){
//            char cv = infix.charAt(i);
            if(!(isOperator(infix.charAt(i)))){
                arr[k] = infix.charAt(i);
                k++;
            }
            else{
                if(operator.isEmpty()) {
                    operator.push(infix.charAt(i));
                    System.out.println(infix.charAt(i));
                    y++;
                }
                else {
                    if (presidence(infix.charAt(i))>presidence(stackTop())) {
                        operator.push(infix.charAt(i));
                        System.out.println(infix.charAt(i));
                        y++;
                    } else {
                        char ch = operator.pop();
                        System.out.println(ch);
                        arr[k] = ch;
                        y--;
                        k++;
                    }
                }
            }
        }

        while (!(operator.isEmpty())){
            arr[k] = operator.pop();
            y--;
            k++;
        }

        System.out.print(arr);

    }

    public static char stackTop(){
        return operator.get(y);
    }

    public static int presidence(char c){
        if (c == '+' || c == '-'){
            return 1;
        }
        else {
            return 2;
        }
    }

    public static boolean isOperator(char c){
        if (c == '+'|| c == '-' || c == '*' || c == '/'){
            return true;
        }
        else {
            return false;
        }
    }
}

