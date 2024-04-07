package Graph;

import java.util.HashSet;

public class GraphClient {
    public static void main(String[] args) {
        GraphImplementation graph = new GraphImplementation(7);
        graph.addEdge(1, 4, 6);
        graph.addEdge(1, 2, 10);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, 5);
        graph.addEdge(4, 5, 1);
        graph.addEdge(5, 6, 4);
        graph.addEdge(7, 5, 2);
        graph.addEdge(6, 7, 3);
        graph.display();
        System.out.println(graph.hasPath(1, 6, new HashSet<>()));
        graph.printAllPath(1, 6, new HashSet<>(), " ");
        System.out.println(graph.BFS(1, 6));
        System.out.println(graph.DFS(1, 6));
    }
}
