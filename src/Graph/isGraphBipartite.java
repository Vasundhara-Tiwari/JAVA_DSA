package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class isGraphBipartite {
    class BipartitePair{
        int vertex;
        int distance;

        public BipartitePair(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }
    public boolean isBipartite(int[][] graph) {
        Queue<BipartitePair> q = new LinkedList<>();
        HashMap<Integer, Integer> visited = new HashMap<>();
        for(int i = 0; i < graph.length; i++){
            if(visited.containsKey(i)){
                continue;
            }
            q.add(new BipartitePair(i, 0));
            while (!q.isEmpty()){
                BipartitePair r = q.poll();
                // odd even cycle check
                if(visited.containsKey(r.vertex)){
                    if(visited.get(r.vertex) != r.distance){
                        return false;
                    } else {
                        continue;
                    }
                }
                visited.put(r.vertex, r.distance);
                for(int neighbour: graph[r.vertex]){
                    if(!visited.containsKey(neighbour)){
                        q.add(new BipartitePair(neighbour, r.distance+1));
                    }
                }
            }
        }
        return true;
    }
}
