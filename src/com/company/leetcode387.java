package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class leetcode387 {
    public static void main(String[] args) {
        String s = "aabb";

        int p = duplicace(s);
        System.out.println(p);
    }

    private static int duplicace(String s) {
        ArrayList<Character> arrayList = new ArrayList<>();
        int index = 0;
        int i =0;

        while (i!=s.length()){
            boolean bool = false;
            for (int j =0;j<s.length();j++){
                if (arrayList.contains(s.charAt(i))){
                    bool = true;
                    break;
                }
                if (s.charAt(i) == s.charAt(j) && i!=j){
                    arrayList.add(s.charAt(i));
                    bool = true;
                    break;
                }
            }
            if (!bool){
                return i;
            }
            i++;
        }

        return -1;
    }
}
