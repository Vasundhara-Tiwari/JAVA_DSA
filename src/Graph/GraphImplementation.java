package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class GraphImplementation {
    private HashMap<Integer, HashMap<Integer, Integer>> map;
    GraphImplementation(int v){
        map = new HashMap<>();
        for(int i = 1; i <= v; i++)
            map.put(i, new HashMap<>());
    }

    public void addEdge(int v1, int v2, int cost){
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean containsEdge(int v1, int v2){
        return map.get(v2).containsKey(v1);
    }

    public boolean containsVertex(int v1){
        return map.containsKey(v1);
    }

    public int noOfEdge(){
        int sum = 0;
        for(int key: map.keySet()){
            sum += map.get(key).size();
        }
        return sum/2;
    }

    public void removeEdge(int v1, int v2){
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }

    public void removeVertex(int v1){
        for(int v2: map.get(v1).keySet()){
            map.get(v2).remove(v1);
        }
        map.remove(v1);
    }
    public void display(){
        for(int v: map.keySet()){
            System.out.println(v + ": " + map.get(v));
        }
    }

    public boolean hasPath(int source, int destination, HashSet<Integer> visited){
        if(source == destination){
            return true;
        }
        visited.add(source);
        for (int neighbours: map.get(source).keySet()){
            if(!visited.contains(neighbours)){
                boolean ans = hasPath(neighbours, destination, visited);
                if(ans){
                    return true;
                }
            }
        }
        return false;
    }

    public void printAllPath(int source, int destination, HashSet<Integer> visited, String ans){
        if(source == destination){
            System.out.println(ans+"-->"+destination);
            return;
        }
        visited.add(source);
        for (int neighbours: map.get(source).keySet()){
            if(!visited.contains(neighbours)){
                printAllPath(neighbours, destination, visited, ans+"-->"+source);
            }
        }
        visited.remove(source);
    }

    public boolean BFS(int source, int destination){
        Queue<Integer> q = new LinkedList<Integer>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(source);
        while (!q.isEmpty()){
            // 1. remove
            int r = q.poll();   // remove first
            // 2. Ignore if already visited
            if(visited.contains(r)){
                continue;
            }
            // 3. mark visited
            visited.add(r);
            // 4. self work
            if(r == destination){
                return true;
            }
            // 5. Add neighbour which are unvisited
            for(int neighbour: map.get(r).keySet()){
                if (!visited.contains(neighbour)){
                    q.add(neighbour);
                }
            }
        }
        return false;
    }
}
