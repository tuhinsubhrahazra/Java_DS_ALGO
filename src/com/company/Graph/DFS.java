package com.company.Graph;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {
        int v =5;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(v);
        for (int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList,0,1);
        addEdge(adjList,0,2);
        addEdge(adjList,1,2);
        addEdge(adjList,3,4);

        System.out.println(adjList);

        int disconnectedGraph = dfsTraversal(adjList,v);
        System.out.println("\n"+disconnectedGraph);
    }

    private static int dfsTraversal(ArrayList<ArrayList<Integer>> adjList,int v) {
        int count =0;
        boolean []visited = new boolean[v];
        for (int i =0;i<v;i++) {
            if (!visited[i]) {
                dfsRec(adjList, visited, i);
                count++;
            }
        }
        return count;
    }

    private static void dfsRec(ArrayList<ArrayList<Integer>> adjList, boolean[] visited,int s) {
        visited[s] = true;
        System.out.print(s+"  ");

        for (int i: adjList.get(s)){
            if (!visited[i]) {
                dfsRec(adjList, visited, i);
            }
        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
}
