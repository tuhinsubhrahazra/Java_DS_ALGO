package com.company;

import java.util.Scanner;

public class codechef_Red_Alert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        if(sc.hasNextInt()) {
            t = sc.nextInt();
        }

        while (t--!= 0){
            int N= sc.nextInt();
            int D = sc.nextInt();
            int H = sc.nextInt();

            int []arr = new int[N];
            for (int i =0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            int sum =0;
            boolean b = false;

            for(int i=0;i<N;i++)
            {
                sum+=arr[i];
                if(sum>H)
                {
                    b = true;
                    break;
                }
                if(arr[i]==0)
                {
                    sum-=D;
                    if(sum<0)
                    {
                        sum=0;
                    }
                }
            }

            if (b) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
