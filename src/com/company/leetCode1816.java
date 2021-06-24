package com.company;

public class leetCode1816 {
    public static void main(String[] args) {
        String s = "chopper is not a tanuki";
        int k = 5;

        System.out.print(truncateSentence(s,k));
        System.out.println("k");
    }

    public static String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int i =0;
        while (true){
            if (s.charAt(i)==' '){
                k--;
            }
            if (k==0){
                break;
            }
            sb.append(s.charAt(i));
            if(i == s.length()-1){
                break;
            }

            i++;
        }
        return sb.toString();
    }
}
