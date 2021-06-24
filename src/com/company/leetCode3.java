package com.company;

import java.util.ArrayList;

public class leetCode3 {
    public static void main(String[] args) {
        int[] nums = {-5};
//        123978

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i=0;i<nums.length;i++){
            temp.add(nums[i]);
        }

        int gretest = nums[0];

        for (int i=0;i<nums.length;i++){
            if(gretest < nums[i]){
                gretest = nums[i];
            }
        }

        int value =0;

        if(gretest<0){
            value = 1;
        }
        else{
            value =gretest+1;
        }

        for (int i = 1; i<=gretest;i++){
            if(!(temp.contains(i))){
                value = i;
                break;
            }
        }

        System.out.println(value);
    }
}
