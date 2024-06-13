import java.util.*;
import java.util.LinkedList;

class Graph {
    int vertices;
    int[][] adjMatrix;
    ArrayList<LinkedList<Integer>> adjList;

    Graph(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    void add(int src, int dest) {
        adjList.get(src).addFirst(dest);
    }
}

public class adjgraph {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.add(0, 1);
        graph.add(0, 2);
        graph.add(1, 3);
        graph.add(2, 3);
        graph.add(3, 0);
        graph.add(3, 4);
        graph.add(4, 1);

        for (LinkedList<Integer> i : graph.adjList) {
            System.out.println(i);
        }
    }
}
