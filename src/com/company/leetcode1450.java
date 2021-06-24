package com.company;

public class leetcode1450 {
    public static void main(String[] args) {
        int []startTime = {1,2,3};
        int []endTime = {3,2,7};

        int t = busyStudent(startTime,endTime,4);
        System.out.println(t);
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count =0;
        for(int i=0;i<endTime.length;i++){
            if(endTime[i]>=queryTime){
                count++;
            }
        }
        return count;
    }
}
