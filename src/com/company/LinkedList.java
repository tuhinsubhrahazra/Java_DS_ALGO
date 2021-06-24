package com.company;

import javax.lang.model.element.Element;
import java.util.Scanner;

public class LinkedList {

    public static Scanner sc = new Scanner(System.in);

    public static class node{
        int data ;
        node next;
    }

    public static void main(String[] args) {
        System.out.println("hello world\n");

        node head  = new node();
        node first = new node();
        node second = new node();
        node third = new node();

        head.data = 12;
        head.next = first;

        first.data = 14;
        first.next = second;

        second.data = 16;
        second.next= third;

        third.data = 18;
        third.next = null;

        printLinkedList(head);
        insertion(head);
        printLinkedList(head);
        deleteLinkedList(head);
        printLinkedList(head);
    }

    public static void deleteLinkedList(node p){
        System.out.println("Enter the node to delete :");
        int position = sc.nextInt();

        for(int i= 0; i<position -1;i++){
            p=p.next;
        }

        node tempP= p.next;
        int temp = tempP.data;

        p.next = tempP.next;
        tempP = null;

        System.out.println(""+temp+" deleted");

    }

    public static void printLinkedList(node p){
        int i= 0;
//        System.out.println("called");
        if (p != null) {
            while (true){
                System.out.println("Element : "+p.data);
                p = p.next;
                if (p == null){
                    break;
                }
            }
        }
        else{
            System.out.println("p is null");
        }
    }

    public static void insertion(node p){
        int i =0;
        System.out.println("Where you want to insert ? ");
        int position = sc.nextInt();
        System.out.println("Enter the data :");
        int data = sc.nextInt();

        node ptr = new node();

        if(position == 0){
//            node pr = p;

            int dp = p.data;

            p.data = data;
            ptr.data = dp;
            ptr.next = p.next;
            p.next = ptr;

//            ptr.data = data;
//            ptr.next = p;
//            p = ptr;
        }
        else {
            node pr = p;
            while (i != position - 1) {
                pr = pr.next;
                i++;
            }

            ptr.data = data;
            ptr.next = pr.next;
            pr.next = ptr;
        }
    }
}
