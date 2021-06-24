package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class leetCode4 {

    public static class node1{
        int data ;
        node1 next;
    }

    public static void main(String[] args) {
        node1 head1  = new node1();
        node1 first1 = new node1();
        node1 second1 = new node1();

        head1.data = 2;
        head1.next = first1;

        first1.data = 4;
        first1.next = second1;

        second1.data = 3;
        second1.next= null;

        node1 head2  = new node1();
        node1 first2 = new node1();
        node1 second2 = new node1();

        head2.data = 5;
        head2.next = first2;

        first2.data = 6;
        first2.next = second2;

        second2.data = 4;
        second2.next= null;

        int intL1 = 0;
        int intL2 = 0;

        int multi = 10;
        int multi2 = 10;

        int lengthL1 = lengthOfL(head1);
        int lengthL2 = lengthOfL(head2);

        int maxLength1 = 0;
        int maxLength2 = 0;

        if (lengthL1> lengthL2){
            maxLength1 = lengthL1;
        }
        else {
            maxLength2 = lengthL2;
        }

        int []l1 = new int[lengthL1];
        int []l2 = new int[lengthL2];

        for (int i=0;i<lengthL1-2;i++){
            multi = multi*10;
        }

        for (int i=0;i<lengthL2-2;i++){
            multi2 = multi2*10;
        }

        l1 = ReArray(head1,lengthL1);
        l2 = ReArray(head2,lengthL2);

        for (int i=l1.length-1; i>=0; i--){
            intL1 = intL1+(l1[i]*multi);
            multi = multi/10;
        }

        System.out.println(intL1);

        for (int i=l2.length-1; i>=0; i--){
            intL2 = intL2+(l2[i]*multi2);
            multi2 = multi2/10;
        }

        System.out.println(intL2);

        int sum = intL1+intL2;
        String stSum = String.valueOf(sum);
        System.out.println(stSum);

        int stSize = stSum.length();
        int []arr = new int[stSize];
        int []finalArr = new int[stSize];

        for (int i=0;i<stSize;i++){
            int val = Integer.parseInt(String.valueOf(stSum.charAt(i)));
            arr[i] = val;
        }

        for (int i=0;i<stSize;i++){
            finalArr[i]=arr[(stSize-1)-i];
        }

        for (int i:finalArr){
            System.out.println(i);
        }

        node1 p = new node1();

        if (finalArr.length-1 == maxLength1){

        }

//        while (p !=null){
//            System.out.println(p.data);
//            p=p.next;
//        }


    }

    public static int lengthOfL(node1 p){
        int k =0;
        while (p!=null){
            k++;
            p = p.next;
        }
        return k;
    }

    public static int[] ReArray(node1 p, int size){
        int k=0;
        int []arr = new int[size];
        while (p!=null){
            arr[k] = p.data;
            p=p.next;
            k++;
        }
        return arr;
    }
}
