package com.company.Graph;

import java.util.ArrayList;

public class Adjacency_list_representation {
    public static void main(String[] args) {
        int v= 5;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(v);
        for (int i =0;i<v;i++){
            adjList.add(new ArrayList<>());
        }
        addEdge(adjList,0,1);
        addEdge(adjList,0,2);
        addEdge(adjList,1,2);
        addEdge(adjList,1,3);

        printAdjList(adjList);
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
