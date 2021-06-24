package com.company;

import javax.swing.plaf.IconUIResource;
import java.util.LinkedList;
import java.util.List;

public class leetCode1773 {

    public static void main(String[] args) {

        List<List<String>> items = new LinkedList<>();

        List<String> list1 = new LinkedList<>();
        list1.add("phone");
        list1.add("blue");
        list1.add("pixel");

        List<String> list2 = new LinkedList<>();
        list2.add("computer");
        list2.add("silver");
        list2.add("lenovo");

        List<String> list3 = new LinkedList<>();
        list3.add("phone");
        list3.add("gold");
        list3.add("iphone");

        items.add(list1);
        items.add(list2);
        items.add(list3);

        String ruleKey = "type";
        String ruleValue = "phone";

        System.out.println(items);

        int count = countMatches(items,ruleKey,ruleValue);

        System.out.println("The count is : "+count);
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int type = 0;

        if (ruleKey.equals("color")){
            type = 1;
        }
        else if (ruleKey.equals("name")){
            type = 2;
        }

        for (List<String> list: items){
            if (list.get(type).equals(ruleValue)){
                count ++;
            }
        }

        return count;
    }
}
