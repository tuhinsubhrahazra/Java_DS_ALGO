package com.company;

public class leeccode1299 {
    public static void main(String[] args) {
        int []arr = {17,18,5,4,6,1};

//        arr = replace(arr);
        arr = replace2(arr);

        for (int i:arr){
            System.out.println(i);
        }
    }

    private static int[] replace2(int[] arr) {
        int pre = arr[arr.length-1];

        arr[arr.length-1] = -1;
        for (int i = arr.length-2; i>=0; i--){
            int c = arr[i];
            arr[i] = pre;
            pre = Math.max(pre,c);
        }
        return arr;
    }


    private static int[] replace(int[] arr) {
        int []nums = new int[arr.length];
        int k=0;
        for (int i=0;i<arr.length-1;i++){
            int max =0;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]>max){
                    max = arr[j];
                }
            }
            nums[k] = max;
            k++;
        }

        nums[k] = -1;

        return nums;
    }
}
