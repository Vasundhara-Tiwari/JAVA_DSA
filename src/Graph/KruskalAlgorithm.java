package Graph;

import java.util.*;

public class KruskalAlgorithm {
    private HashMap<Integer, HashMap<Integer, Integer>> map;
    public KruskalAlgorithm(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++)
            map.put(i, new HashMap<>());
    }

    public void addEdge(int v1, int v2, int cost){
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public void get(){
        for (Integer e1: map.keySet()) {
            for (Integer e2: map.get(e1).keySet()){

            }
        }
    }

    class EdgePair{
        int e1;
        int e2;
        int cost;

        public EdgePair(int cost, int e2, int e1) {
            this.cost = cost;
            this.e2 = e2;
            this.e1 = e1;
        }

        @Override
        public String toString() {
            return "EdgePair{" +
                    "e1=" + e1 +
                    ", e2=" + e2 +
                    ", cost=" + cost +
                    '}';
        }
    }

    public List<EdgePair> getAllEdges(){
        List<EdgePair> ll = new ArrayList<>();
        for(int e1: map.keySet()){
            for (int e2: map.get(e1).keySet()){
                int cost = map.get(e1).get(e2);
                ll.add(new EdgePair(e1, e2, cost));
            }
        }
        return ll;
    }

    public void kruskal(){
        List<EdgePair> ll = getAllEdges();
        Collections.sort(ll, new Comparator<EdgePair>() {
            @Override
            public int compare(EdgePair o1, EdgePair o2) {
                return o1.cost - o2.cost;
            }
        });
        int sum = 0;
        DisjointSetUnion dsu = new DisjointSetUnion();
        for (int v: map.keySet()){
            dsu.createSet(v);
        }
        for (EdgePair e: ll) {
            int re1 = dsu.find(e.e1);
            int re2 = dsu.find(e.e2);
            if (re1 == re2){

            } else {
                dsu.union(e.e1, e.e2);
                System.out.println(e);
                sum += e.cost;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        KruskalAlgorithm ks = new KruskalAlgorithm(v);
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            int cost = scanner.nextInt();
            ks.addEdge(v1, v2, cost);
        }
        ks.kruskal();
    }
}
