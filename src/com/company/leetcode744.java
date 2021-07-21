package com.company;

public class leetcode744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';

        System.out.println(nextGreatestLetter(letters,target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int low =0;
        int high = letters.length -1;

        while (low<=high){
            int mid = (low + high)/2;
            if (mid ==0 || (letters[mid] > target && letters[mid-1] <= target)){
                return letters[mid];
            }
            else{
//                if (letters[mid] < target)
            }
        }

        return 'c';
    }
}
