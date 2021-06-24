package com.company;

import java.util.Arrays;

public class leetCodeSort1 {
    public static void main(String[] args) {
        int []indices = {4,5,6,7,0,2,1,3};
        String s = "codeleet";

        s = restoreString(s,indices);

        System.out.println(s);

    }

    public static String restoreString(String s, int[] indices) {

        char []chArray = new char[s.length()];

        for (int i = 0;i<s.length();i++){
            chArray[indices[i]] = s.charAt(i);
        }

        return new String(chArray);

    }
}
