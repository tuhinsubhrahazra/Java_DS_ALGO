package com.company.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        int v= 7;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(v);
        for (int i =0;i<v;i++){
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList,0,1);
        addEdge(adjList,0,2);
        addEdge(adjList,2,3);
        addEdge(adjList,1,3);
        addEdge(adjList,4,5);
        addEdge(adjList,5,6);
        addEdge(adjList,4,6);

//        printAdjList(adjList);
        
        int c = bfsDin(adjList,v);
        System.out.println("\nCount : "+c);
    }

    private static int bfsDin(ArrayList<ArrayList<Integer>> adjList,int v){
        int count =0;
        boolean []visited = new boolean[v];

        for (int i =0;i<v;i++){
            if (!visited[i]) {
                bfs(adjList, visited, i);
                count++;
            }
        }
        return count;
    }

    private static void bfs(ArrayList<ArrayList<Integer>> adjList,boolean []visited, int s) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;

        while (!queue.isEmpty()){
            int p = queue.poll();
            System.out.print(p + "    ");

            for (int i: adjList.get(p)){
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

    }

    private static void printAdjList(ArrayList<ArrayList<Integer>> adjList) {
        for (int i=0;i<adjList.size();i++){
            for (int j=0;j<adjList.get(i).size();j++){
                System.out.print(adjList.get(i).get(j)+"   ");
            }
            System.out.println();
        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> arrayList,int v,int e) {
        arrayList.get(v).add(e);
        arrayList.get(e).add(v);
    }
}
