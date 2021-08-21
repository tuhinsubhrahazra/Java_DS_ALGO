package com.company.Graph;

import java.util.ArrayList;
import java.util.Stack;

public class Tropologicak_sorting_using_DFS {
    public static void main(String[] args) {
        int v = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        for (int i =0;i<v;i++){
            adj.add(new ArrayList<>());
        }
//
//        addEdge(adj,0,1);
//        addEdge(adj,1,3);
//        addEdge(adj,3,4);
//        addEdge(adj,2,3);
//        addEdge(adj,2,4);

        addEdge(adj,0,1);
        addEdge(adj,0,4);
        addEdge(adj,1,2);
        addEdge(adj,4,2);
        addEdge(adj,2,3);
        addEdge(adj,4,5);
        addEdge(adj,3,5);

//        System.out.println(adj);
        TropoSort(adj, v);
    }

    private static void TropoSort(ArrayList<ArrayList<Integer>> adj, int v) {
        Stack<Integer> stack = new Stack<>();
        boolean []visited = new boolean[v];
        for (int i=0;i<v;i++){
            if (!visited[i]) {
                tropoSortRec(adj, visited,stack, i);
            }
        }

//        System.out.println(stack);
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+"  ");
        }
    }

    private static void tropoSortRec(ArrayList<ArrayList<Integer>> adj, boolean[] visited,
                                     Stack<Integer> stack , int i) {

        visited[i] = true;
        for (int u:adj.get(i)){
            if (!visited[u]){
                tropoSortRec(adj,visited,stack,u);
            }
        }
        stack.push(i);
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }
}
