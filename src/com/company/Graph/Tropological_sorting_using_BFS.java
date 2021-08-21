package com.company.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tropological_sorting_using_BFS {
    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        for (int i =0;i<v;i++){
            adj.add(new ArrayList<>());
        }

        addEdge(adj,0,2);
        addEdge(adj,0,3);
        addEdge(adj,1,3);
        addEdge(adj,2,3);
        addEdge(adj,1,4);

//        addEdge(adj,0,1);
//        addEdge(adj,0,2);
//        addEdge(adj,1,3);
//        addEdge(adj,2,3);
//        addEdge(adj,3,4);
//        addEdge(adj,3,5);

        System.out.println(adj);
        TropoSort(adj, v);

    }

    private static void TropoSort(ArrayList<ArrayList<Integer>> adj,int v) {
        Queue<Integer> queue = new LinkedList<>();
        int []degree = new int[v];
        boolean []visited = new boolean[v];

        for (int u=0;u<v;u++){
            for (int ver:adj.get(u)){
                degree[ver]++;
            }
        }

        for (int i=0;i<v;i++){
            if (degree[i] == 0)
                queue.add(i);
        }

        while (!queue.isEmpty()){
            int n = queue.poll();
            System.out.print(n+"  ");
            for (int u:adj.get(n)){
                degree[u]--;
                if (degree[u] == 0){
                    queue.add(u);
                }
            }
        }

    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }
}
