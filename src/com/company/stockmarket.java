package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class stockmarket {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};

        int extraCandies = 3;

        List<Boolean> list;

        list = kidsWithCandies(candies,extraCandies);
        for (boolean t:list){
            System.out.println(t);
        }
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> nList = new LinkedList<>();

        for (int i : candies){
            boolean istrue = true ;
            int v= i+extraCandies;
            for (int x:candies){
                if (!(v>=x)){
                    istrue = false;
                    break;
                }
            }
//            System.out.println();
            nList.add(istrue);
        }

        return nList;
    }
}
