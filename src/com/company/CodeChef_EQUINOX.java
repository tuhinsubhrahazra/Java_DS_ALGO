 package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeChef_EQUINOX {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int T = 0;

        if(reader.hasNextInt()){
            T = reader.nextInt();

            for(int i =0; i< T;i++) {

                long aa = 0;
                long bb = 0;
                long A = 0;
                long B = 0;

                // int aa = 0;
                // int bb = 0;
                // int A = 0;
                // int B = 0;

                ArrayList<String> arrayList = new ArrayList<>();

                //            System.out.println("Enter N :");
                try {
                    long n =0;
                    n = reader.nextLong();
                    A = reader.nextLong();
                    B = reader.nextLong();

                    // n = reader.nextInt();
                    // A = reader.nextInt();
                    // B = reader.nextInt();


                    for (int j = 0; j < n; j++) {
                        String s = null;

                        s = reader.next();

                        arrayList.add(s);

                    }

                    for (int k = 0; k < n; k++) { //EQUINOX
                        char r = arrayList.get(k).charAt(0);
                        if (r == 'E' || r == 'Q' || r == 'U' || r == 'I' || r == 'N' || r == 'O' || r == 'X') {
                            aa++;
                        } else {
                            bb++;
                        }
                    }
                }
                catch (Exception e){
                    return;
                }

                A = aa * A;
                B = bb * B;

                if (A>B){
                    System.out.println("SARTHAK");
                }
                else if (B>A){
                    System.out.println("ANURADHA");
                }
                else{
                    System.out.println("DRAW");
                }
            }
        }

    }
}
