package com.company;

import java.util.Scanner;

public class Queue {

    public static Scanner sc = new Scanner(System.in);

    public static int size = 5;
    public static int p = -1;
    public static int [] Queue = new int[size];

    public static boolean isQueueFull(){
        if(p == size){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isQueueEmpty(){
        if(p == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void push(){
        p++;
        if(isQueueFull()){
            System.out.println("The Stack is full !!!");
        }
        else {
            System.out.println("Enter the value : ");
            Queue[p] = sc.nextInt();
            System.out.println("Data Stored");
        }
    }

    public static void pop(){
        if(isQueueEmpty()){
            System.out.println("The Stack is Empty !!!");
        }
        else {
            p = size - p;
            int tv = Queue[p];
            Queue[p] = 0;
            System.out.println(tv+" data deleted");
        }
    }

    public static void printStack(){
        if(isQueueEmpty()){
            System.out.println("The Stack is Empty !!!");
        }
        else {
//            for (int i= size-1; i>=0; i--) {
//                System.out.println("-> " + Queue[i]);
//            }
            for(int v : Queue){
                System.out.println("-> " + v);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hello");

        push();
        printStack();
        push();
        push();
        push();
        push();
        push();
        printStack();
        pop();
        printStack();
    }
}
