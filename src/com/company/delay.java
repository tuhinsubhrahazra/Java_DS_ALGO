package com.company;

import java.io.IOException;

public class delay {
    public static void main(String[] args) throws IOException, InterruptedException {

        int i =1;
        while (i==1){
            try {
                Thread.sleep(1000);
                clearScreen();
                System.out.println("tuhin");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
