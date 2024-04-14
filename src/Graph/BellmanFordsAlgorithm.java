package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BellmanFordsAlgorithm {
    class EdgePair {
        int v1;
        int v2;
        int cost;

        public EdgePair(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }
    }
    private HashMap<Integer, HashMap<Integer, Integer>> map;
    public BellmanFordsAlgorithm(int v){
        map = new HashMap<>();
        for(int i = 1; i <= v; i++)
            map.put(i, new HashMap<>());
    }

    public void addEdge(int v1, int v2, int cost){
        map.get(v1).put(v2, cost);
    }
    public List<EdgePair> getAllEdge(){
        List<EdgePair> lst = new ArrayList<>();
        for(int e1: map.keySet()){
            for(int e2: map.get(e1).keySet()){
                lst.add(new EdgePair(e1, e2, map.get(e1).get(e2)));
            }
        }
        return lst;
    }

    public void bellmanFord(){
        int[] distance = new int[map.size()+1];
        for(int i = 2; i < distance.length; i++){
            distance[i] = 9999999;
        }
        List<EdgePair> ll = getAllEdge();
        int v = map.size();
        for(int i = 1; i <= v; i++){
            for(EdgePair e: ll){
                if(i == v && distance[e.v2] > distance[e.v1]+e.cost){
                    System.out.println("Negative weight cycle");
                    return;
                }
                if(distance[e.v2] > distance[e.v1]+e.cost){
                    distance[e.v2] = distance[e.v1] + e.cost;
                }
            }
        }
        for(int i = 2; i < distance.length; i++){
            System.out.println(i + " " + distance[i]);
        }
    }

    public static void main(String[] args) {
        BellmanFordsAlgorithm bfd = new BellmanFordsAlgorithm(5);
        bfd.addEdge(1, 2, 8);
        //bfd.AddEdge(2, 5, -2);
        bfd.addEdge(2, 5, 2);
        bfd.addEdge(5, 2, 1);
        bfd.addEdge(4, 5, 4);
        bfd.addEdge(3, 4, -3);
        bfd.addEdge(1, 3, 4);
        bfd.addEdge(1, 4, 5);
        bfd.bellmanFord();
    }
}
