package com.company.Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class detect_cycle_in_undirected_graph {
    public static void main(String[] args) {
        int v = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        for (int i =0;i<v;i++){
            adj.add(new ArrayList<>());
        }

        addEdge(adj,0,1);
        addEdge(adj,1,2);
        addEdge(adj,2,4);
        addEdge(adj,4,5);
        addEdge(adj,1,3);
        addEdge(adj,2,3);

        detectCycle(adj,v);
    }

    private static void detectCycle(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean []visited = new boolean[v];
        for (int i =0;i<v;i++){
            if (!visited[i]) {
                System.out.println(detectCycleRec(adj, visited, -1, i));
            }
        }
    }

    private static boolean detectCycleRec(ArrayList<ArrayList<Integer>> adj,boolean []visited, int parent, int s) {

        visited[s] = true;
        for (int u : adj.get(s)) {
            if (!visited[u]) {
                if (detectCycleRec(adj, visited, s, u)){
                    return true;
                }
            }
            else if (u!=parent){
                return true;
            }
        }

        return false;
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int i1) {
        adj.get(i).add(i1);
        adj.get(i1).add(i);
    }
}
