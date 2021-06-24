package com.company;

public class leetCode8 {
    public static void main(String[] args) {
        int []nums = {1,2,3,1,1,3};

        for (int i=0;i<nums.length;i++){
            for (int j=i;j<nums.length;j++){
                System.out.println(i+""+j);
            }
        }
    }
}
