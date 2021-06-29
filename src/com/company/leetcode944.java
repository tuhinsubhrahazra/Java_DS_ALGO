package com.company;

import java.nio.charset.StandardCharsets;

public class leetcode944 {
    public static void main(String[] args) {
        String []strs = {"zyx","wvu","tsr"};

        int mD = minDeletionSize(strs);

        System.out.println(mD);
    }

    public static int minDeletionSize(String[] strs) {
        int count =0;
        for (int i =0;i< strs[0].length();i++){
            int store = 0;
            for (int j = 0;j<strs.length;j++){
                char c = strs[j].charAt(i);
                int bValue = (int) c;
                if (bValue < store){
                    count++;
                    break;
                }
                store = bValue;
            }
        }
        return count;
    }
}
