package com.company;

import java.util.ArrayList;

public class leetcode2 {
    public static void main(String[] args) {
        int[] nums ={0,4,3,0};
        int target = 0;

//        ArrayList<Integer> op = new ArrayList<>();
        int []arr = new int[2];

//        for (int i=0;i<nums.length;i++){
//            op.add(nums[i]);
//        }

//        System.out.println(op);

//        for (int i=0;i<op.size();i++){
//            for(int j=i+1;j<op.size();j++){
//                int sum = op.get(i) + op.get(j);
//                if (sum==target){
//                    System.out.println(sum);
//                    arr[0] =i;
//                    arr[1] =j;
//                    break;
//                }
//            }
//        }

        for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum = nums[i] + nums[j];
                if (sum==target){
                    arr[0] =i;
                    arr[1] =j;
                    break;
                }
            }
        }

        for (int v:arr) {
            System.out.println(v);
        }
    }
}
