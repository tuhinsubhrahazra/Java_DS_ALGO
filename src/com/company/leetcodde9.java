package com.company;

public class leetcodde9 {
    public static void main(String[] args) {
        System.out.println("hello");
        int[][] grid = {{3,2},
                        {-3,-3},
                        {-3,-3},
                        {-3,-3}
                        };

        int count = 0;
        int i=0;
        int k = grid[i].length-1;

        while (i<grid.length){
            if(grid[i][k] < 0){
                System.out.println(k);
                count++;
                if (k<=0){
                    i++;
                    if (!(i> grid.length-1)){
                        k = grid[i].length - 1;
                    }
                }
                else {
                    k--;
                }
            }
            else {
                i++;
                if (!(i> grid.length-1)){
                    k = grid[i].length - 1;
                }
            }
        }

        System.out.println();
        System.out.println(count);
    }
}
