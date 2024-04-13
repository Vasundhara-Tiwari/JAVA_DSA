package Graph;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {

    class DijkstraPair {
        int vertex;
        String acquiringPath;
        int cost;

        public DijkstraPair(int vertex, String acquiringPath, int cost) {
            this.vertex = vertex;
            this.acquiringPath = acquiringPath;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "DijkstraPair{" +
                    "vertex=" + vertex +
                    ", acquiringPath='" + acquiringPath + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }
    private HashMap<Integer, HashMap<Integer, Integer>> map;
    public DijkstraAlgorithm(int v){
        map = new HashMap<>();
        for(int i = 1; i <= v; i++)
            map.put(i, new HashMap<>());
    }

    public void addEdge(int v1, int v2, int cost){
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public void Dijkstra(){
        PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {
            @Override
            public int compare(DijkstraPair o1, DijkstraPair o2) {
                return o1.cost - o2.cost;
            }
        });
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new DijkstraPair(1, "1", 0));
        while (!pq.isEmpty()){
            DijkstraPair rp = pq.poll();
            if(visited.contains(rp.vertex)){
                continue;
            }
            visited.add(rp.vertex);
            System.out.println(rp.toString());
            for(int neighbour: map.get(rp.vertex).keySet()){
                if(!visited.contains(neighbour)){
                    int cost = map.get(rp.vertex).get(neighbour);
                    pq.add(new DijkstraPair(neighbour, rp.acquiringPath+neighbour, rp.cost + cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        DijkstraAlgorithm da = new DijkstraAlgorithm(1);
        da.Dijkstra();
    }
}
