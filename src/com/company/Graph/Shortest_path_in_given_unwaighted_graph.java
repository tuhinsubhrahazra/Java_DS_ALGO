package com.company.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Shortest_path_in_given_unwaighted_graph {
    public static void main(String[] args) {
        int v = 4;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i =0;i<v;i++){
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList,0,1);
        addEdge(adjList,0,2);
        addEdge(adjList,1,2);
        addEdge(adjList,1,3);
        addEdge(adjList,2,3);

//        System.out.println(adjList);

        sortPath(adjList,v);
    }

    private static void sortPath(ArrayList<ArrayList<Integer>> adjList, int ver) {
        int []dist = new int[ver];
        boolean []visited = new boolean[ver];
        int s =0;
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        while (!queue.isEmpty()){
            int u = queue.poll();
            for (int v: adjList.get(u)){
                if (!visited[v]){
                    queue.add(v);
                    visited[v] = true;
                    dist[v] = dist[u] + 1;
                }
            }
        }

        for (int n: dist){
            System.out.print(n+"  ");
        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
}
