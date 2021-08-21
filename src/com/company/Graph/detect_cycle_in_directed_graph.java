package com.company.Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class detect_cycle_in_directed_graph {
    public static void main(String[] args) {
        int v = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        for (int i =0;i<v;i++){
            adj.add(new ArrayList<>());
        }

//        addEdge(adj,0,1);
//        addEdge(adj,1,2);
//        addEdge(adj,1,3);
//        addEdge(adj,2,4);
//        addEdge(adj,3,4);
//        addEdge(adj,4,5);

        addEdge(adj,0,1);
        addEdge(adj,2,1);
        addEdge(adj,2,3);
        addEdge(adj,3,4);
        addEdge(adj,4,5);
        addEdge(adj,5,3);

        System.out.println(adj);

        System.out.println(detectCycle(adj,0,v));
        System.out.println(detectCycleOptimized(adj,0,v));
    }

    private static boolean detectCycleOptimized(ArrayList<ArrayList<Integer>> adj, int s, int v) {
        Queue<Integer> queue = new LinkedList<>();
        int count =0;
        int []degree = new int[v];

        for (int u=0;u<v;u++){
            for (int ver:adj.get(u)){
                degree[ver]++;
            }
        }

        for (int i=0;i<v;i++){
            if (degree[i] == 0){
                queue.add(i);
                count++;
            }
        }

        while (!queue.isEmpty()){
            int c = queue.poll();
            for (int t:adj.get(c)){
                degree[t]--;
                if (degree[t]==0) {
                    queue.add(t);
                    count++;
                }
            }
        }
        return  (count !=v);

    }

    private static boolean detectCycle(ArrayList<ArrayList<Integer>> adj,int s ,int v) {
        boolean []visited = new boolean[v];
        boolean []rec = new boolean[v];
        for (int i=0;i<v;i++){
            if (!visited[i]) {
                if (cycleRec(adj, visited, rec, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean cycleRec(ArrayList<ArrayList<Integer>> adj, boolean[] visited,boolean []rec, int i) {
        visited[i] = true;
        rec[i] = true;
        for (int u: adj.get(i)){
            if (!visited[u] ){
                if(cycleRec(adj,visited,rec,u)){
                    return true;
                }
            }
            else if(rec[u]){
                return true;
            }
        }
        rec[i] = false;
        return false;
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }
}
