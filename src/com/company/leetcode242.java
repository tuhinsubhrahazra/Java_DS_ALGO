package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class leetcode242 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

        System.out.println(isAnagram(s,t));

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            char []sArr = s.toCharArray();
            char []tArr = t.toCharArray();

            Arrays.sort(sArr);
            Arrays.sort(tArr);

            return Arrays.equals(sArr,tArr);
        }
        else{
            return false;
        }
    }
}
