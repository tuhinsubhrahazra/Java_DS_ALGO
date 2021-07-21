package com.company;

public class leetcode35 {
    public static void main(String[] args) {
        int []arr = {1,3,5,6};
        int n =0;

        System.out.println(searchInsert(arr,n));
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int sTarget =0;

        while (low <= high){
            int mid = (low +high)/2;
            if (nums[mid] == target){
                return mid;
            }
            else if (target < nums[mid]){
                high = mid -1;
            }
            else {
                sTarget = mid;
                low  = mid +1;
            }
        }

        if(nums[sTarget] < target)
            return sTarget + 1;
        else
            return sTarget;
    }
}
