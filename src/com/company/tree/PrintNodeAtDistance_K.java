package com.company.tree;

public class PrintNodeAtDistance_K {

    private static class Dis{
        int data;
        Dis left;
        Dis right;

        public Dis(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Dis dis = new Dis(10);
        dis.left = new Dis(20);
        dis.left.left = new Dis(40);
        dis.left.right = new Dis(50);
        dis.right = new Dis(30);
        dis.right.right = new Dis(70);
        dis.right.right.right = new Dis(80);

        int k = 2;
        Print(dis, k);

    }

    private static void Print(Dis dis, int k) {
        if (dis == null){
            return;
        }
        if (k == 0){
            System.out.println(dis.data);
        }
        else {
            Print(dis.left,k-1);
            Print(dis.right,k-1);
        }
    }
}
