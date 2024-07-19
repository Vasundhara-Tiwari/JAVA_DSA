package Graph;

import java.util.*;

public class PrimsMinimumSpanningTree {

    class PrimsPair {
        int vertex;
        int acquiringVertex;
        int cost;

        public PrimsPair(int vertex, int acquiringVertex, int cost) {
            this.vertex = vertex;
            this.acquiringVertex = acquiringVertex;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "PrimsMinimumSpanningTree{" +
                    "vertex=" + vertex +
                    ", acquiringVertex=" + acquiringVertex +
                    ", cost=" + cost +
                    '}';
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();      //vertex
        int m = scanner.nextInt();      //edge
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        for(int i = 0; i <= n; i++){
            map.put(i, new HashMap<>());
        }
        for(int i = 0; i < m; i++){
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            int cost = scanner.nextInt();
            map.get(v1).put(v2, cost);
            map.get(v2).put(v1, cost);
        }
        PrimsMinimumSpanningTree p = new PrimsMinimumSpanningTree();
        System.out.println(p.prims(map));
    }
    public int prims(HashMap<Integer, HashMap<Integer, Integer>> map){
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
            @Override
            public int compare(PrimsPair o1, PrimsPair o2) {
                return o1.cost - o2.cost;
            }
        });
        HashSet<Integer> visited = new HashSet<>();
        int sum = 0;
        pq.add(new PrimsPair(1, 1, 0));
        while (!pq.isEmpty()){
            PrimsPair rp = pq.poll();
            if(visited.contains(rp.vertex)){
                continue;
            }
            visited.add(rp.vertex);
            System.out.println(rp.toString());
            sum += rp.cost;
            for(int neighbour: map.get(rp.vertex).keySet()){
                if(!visited.contains(neighbour)){
                    int cost = map.get(rp.vertex).get(neighbour);
                    pq.add(new PrimsPair(neighbour, rp.vertex, cost));
                }
            }
        }
        return sum;
    }
}
