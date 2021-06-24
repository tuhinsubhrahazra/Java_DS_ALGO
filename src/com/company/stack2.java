package com.company;


import java.util.Random;
import java.util.Scanner;

public class stack2 {

//    private static Random sc;
    //    private static int[] stack;
    public static Scanner sc = new Scanner(System.in);

    public static int size = 5;
    public static int p = -1;
    public static int []stack = new int[size];

    public static boolean isStackFull(){
        if(p == size){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isStackEmpty(){
        if(p == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void push(){
        p++;
        if(isStackFull()){
            System.out.println("The Stack is full !!!");
        }
        else {
            System.out.println("Enter the value : ");
            stack[p] = sc.nextInt();
            System.out.println("Data Stored");
        }
    }

    public static void pop(){
        if(isStackEmpty()){
            System.out.println("The Stack is Empty !!!");
        }
        else {
            p--;
            int tv = stack[p];
            stack[p] = 0;
            System.out.println(tv+" data deleted");
        }
    }

    public static void printStack(){
        if(isStackEmpty()){
            System.out.println("The Stack is Empty !!!");
        }
        else {
//            for(int v : stack){
//                System.out.println("-> "+v);
//            }
            for (int i= size-1; i>=0; i--) {
                System.out.println("-> " + stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("hello");

        push();
        printStack();
        push();
        push();
        push();
        push();
        push();
        pop();
        printStack();
    }
}
