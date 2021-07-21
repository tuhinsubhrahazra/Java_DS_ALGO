package com.company;

import java.util.ArrayList;

public class leetcode1108 {
    public static void main(String[] args) {
        String address = "1.1.1.1";

        String s = defangIPaddr(address);
        String s2 = defangIPaddr2(address);
        String s3 = defangIPaddr3(address);

        System.out.println(s2);
    }

    private static String defangIPaddr3(String address) {
        String str = "";
        for (int i =0;i<address.length();i++){
            if(address.charAt(i) == '.'){
                str+="[.]";
            }else {
                str+=address.charAt(i);
            }
        }
        return str;
    }

    private static String defangIPaddr2(String address) {
        int count =0;
        for (int i =0;i<address.length();i++){
            if (address.charAt(i) == '.'){
                count++;
            }
        }
        count = count*2;
        char []chars = new char[address.length()+count];

        int k =0;
        for (int i =0;i<address.length();i++){
            if (address.charAt(i) == '.'){
                chars[k] = '[';
                k++;
                chars[k] = '.';
                k++;
                chars[k] = ']';
                k++;
            }
            else {
                chars[k] = address.charAt(i);
                k++;
            }
        }

        return new String(chars);
    }

    public static String defangIPaddr(String address) {
        ArrayList<Character> characters = new ArrayList<>();

        for (int i =0;i<address.length();i++){
            char c = address.charAt(i);
            if (c == '.'){
                characters.add('[');
                characters.add('.');
                characters.add(']');
            }
            else{
                characters.add(c);
            }
        }

        char []chars = new char[characters.size()];
        int k =0;
        for (char c: characters){
            chars[k] = c;
            k++;
        }

        return new String(chars);
    }
}
