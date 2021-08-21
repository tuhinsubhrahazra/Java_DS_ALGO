package com.company.Graph;

import javax.tools.Diagnostic;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class Sortest_path_in_a_DAG {

    public static class AdjNode{
        int weight ;
        int v;
        public AdjNode(int v,int weight){
            this.v = v;
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }
        public int getV() {
            return v;
        }
    }

    public static class Graph{
        int v;
        ArrayList<ArrayList<AdjNode>> adj ;
        public Graph(int v){
            this.v = v;
            adj = new ArrayList<>(v);
            for (int i=0;i<v;i++){
                adj.add(new ArrayList<>());
            }
        }

        public void addEdge(int u,int v,int w){
            AdjNode adjNode = new AdjNode(v,w);
            adj.get(u).add(adjNode);
        }

        public void print(){
            for (int u= 0;u<v;u++){
                ArrayList<AdjNode> a = adj.get(u);
//                System.out.println(a.size());
                for (int j=0;j<a.size();j++){
                    AdjNode aj = a.get(j);
                    System.out.println(" v : "+aj.getV()+" w : "+aj.getWeight());
                }
                System.out.println();
            }
        }

        public Stack<Integer> TropoSort(){
            Stack<Integer> stack = new Stack<>();
            boolean []visited = new boolean[v];
            for (int i =0;i<v;i++){
                if (!visited[i]) {
                    TropoRec(stack, visited, i);
                }
            }

//            ArrayList<Integer> tropoArrayList = new ArrayList<>();
//            while (!stack.isEmpty()){
//                tropoArrayList.add(stack.pop());
//            }

            return stack;
//            System.out.println(tropoArrayList);
        }

        private void TropoRec(Stack<Integer> stack, boolean[] visited, int i) {
            visited[i] = true;
            for (AdjNode aj: adj.get(i)){
                if (!visited[aj.getV()]){
                    TropoRec(stack,visited,aj.getV());
                }
            }
            stack.push(i);
        }

        public void sortestPath(int s){
            int []dist = new int[v];
            for (int i=0;i<v;i++){
                dist[i] = Integer.MAX_VALUE;
            }
            dist[s] = 0;
            Stack<Integer> stack = TropoSort();
//            System.out.println(stack);
            while (!stack.isEmpty()){
                int u = stack.pop();
                if (dist[u] != Integer.MAX_VALUE) {
                    for (AdjNode adjv : adj.get(u)) {
                        int v = adjv.getV();
                        int w = adjv.getWeight();
                        if (dist[v] > dist[u] + w) {
                            dist[v] = dist[u] + w;
                        }
                    }
                }
            }

            for (int i=0;i<v;i++){
                if (dist[i] == Integer.MAX_VALUE){
                    System.out.print("INF  ");
                }
                else{
                    System.out.print(dist[i]+"  ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0,1,2);
        graph.addEdge(1,2,3);
        graph.addEdge(2,3,6);
        graph.addEdge(0,4,1);
        graph.addEdge(4,2,2);
        graph.addEdge(4,5,4);
        graph.addEdge(5,3,1);

//        graph.print();

        graph.sortestPath(4);

    }
}
