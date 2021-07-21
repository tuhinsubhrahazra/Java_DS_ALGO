package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class codechefDenomination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;

        if (sc.hasNextInt()) {
            t = sc.nextInt();
        }
        while (t--!=0){
            int N = sc.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();

            for (int i =0;i<N;i++){
                int v = sc.nextInt();
                arrayList.add(v);
            }

            Collections.sort(arrayList);

            int maxArr = Collections.max(arrayList);
            int minArr = Collections.min(arrayList);

            int devi = 1;
            for (int i =2;i<=minArr;i++){
                boolean bool = false;
                for (int j =0;j<N-1;j++){
                    if (arrayList.get(j) % i == 0){
                        bool = true;
                    }
                    else{
                        bool = false;
                        break;
                    }
                }
                if (bool){
                    devi = i;
                }
            }

            int count = 0;
            for (int i =0;i<arrayList.size() -1;i++) {
                count = count + (arrayList.get(i) / devi);
            }
            count++;

            System.out.println(count);

        }
    }
}
