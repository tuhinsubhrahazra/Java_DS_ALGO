package com.company;

public class leetcode1 {
    public static void main(String[] args) {
        int []nums = {-1,-1,0,0,-1,-1};

        int Value = -1 ;

        int lt = nums.length;

        for (int i=0;i<nums.length;i++){
            if (i == 0){
                int countLeft =0;
                int countRight =0;

                for (int k= i+1; k<nums.length;k++){
                    countRight = countRight+nums[k];
                }
                if (countLeft == countRight) {
                    Value = i;
                    break;
                }
            }
            else if(i == lt-1){
                int countLeft =0;
                int countRight =0;

                for (int j =0;j<i;j++){
                    countLeft = countLeft +nums[j];
                }
                if (countLeft == countRight){
                    Value = i;
                    break;
                }
            }
            else {
                int countLeft =0;
                int countRight =0;

                for (int j=0;j<i;j++){
                    countLeft = countLeft + nums[j];
                }
                for (int j =i+1;j<nums.length;j++){
                    countRight = countRight +nums[j];
                }
                if (countLeft == countRight){
                    Value = i;
                    break;
                }
            }
        }

        System.out.println(Value);
    }
}
