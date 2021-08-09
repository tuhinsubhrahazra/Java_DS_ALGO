package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class leetcode169 {
    public static void main(String[] args) {
        int []arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            if (hashMap.containsKey(nums[i])){
                int c = hashMap.get(nums[i]);
                hashMap.put(nums[i],c+1);
            }
            else{
                hashMap.put(nums[i],1);
            }
        }
        int co = Collections.max(hashMap.values());
        for (Map.Entry<Integer , Integer> entry : hashMap.entrySet()){
            if (entry.getValue() == co){
                return entry.getKey();
            }
        }

        return 0;
    }
}
