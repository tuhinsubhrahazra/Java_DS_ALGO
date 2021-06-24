package com.company;

import java.util.Scanner;

public class dubty_link_list {

    public static Scanner sc = new Scanner(System.in);

    public static class node2{
        int data;
        node2 next;
        node2 prev;
    }

    public static void main(String[] args) {
        System.out.println("Hello world");

        node2 head = new node2();
        node2 first = new node2();
        node2 second = new node2();
        node2 third = new node2();
        node2 fourth = new node2();
        node2 fifth = new node2();

        head.data = 12;
        head.prev = null;
        head.next = first;

        first.data = 14;
        first.next= second;
        first.prev = head;

        second.data = 16;
        second.next=third;
        second.prev= first;

        third.data = 18;
        third.next=fourth;
        third.prev= second;

        fourth.data= 20;
        fourth.next= fifth;
        fourth.prev= third;

        fifth.data= 22;
        fifth.next= null;
        fifth.prev=fourth;

        int breakCode = 0;
        while (true) {

            printLinkedList(head);

            System.out.println();

            reversePrintLinkedList(fifth);

            deleteLinkedList(head);
            printLinkedList(head);


            System.out.println("Are you want to Exit Program ? \n Enter y for yes \n Enter n for no");
            String e = sc.next();
            if (e.equals("y")){
                break;
            }
        }

    }


    public static void deleteLinkedList(node2 p){
        System.out.println("Enter the node to delete :");
        int position = sc.nextInt();

        node2 q = p.next;
        node2 r = p.next;

        for(int i= 0; i<position-1; i++){
            p = p.next;
            q= q.next;
            r= r.next;
        }

        q= q.next;
        p.next = r.next;
        q.prev = p;
        int temp = r.data;
        r= null;
        System.out.println(""+temp+" Deleted");

    }

    public static void reversePrintLinkedList(node2 p){
        int i = 5;
        while (p != null){
            System.out.println("Element no "+i+" :"+p.data);
            p= p.prev;
            i--;
        }
    }

    public static void printLinkedList(node2 p){
        int i = 0;
        while (p != null) {
            System.out.println("Element no " + i + " : " + p.data);
            p = p.next;
            i++;
        }
    }

}
