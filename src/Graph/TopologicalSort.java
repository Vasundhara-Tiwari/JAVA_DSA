package Graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {
    private HashMap<Integer, HashMap<Integer, Integer>> map;
    public TopologicalSort(int v){
        map = new HashMap<>();
        for(int i = 0; i <= v; i++)
            map.put(i, new HashMap<>());
    }

    public void addEdge(int v1, int v2){
        map.get(v1).put(v2, 0);
    }

    public int[] inDegree(){
        int[] inDegreeArray = new int[map.size()];
        for(int e: map.keySet()){
            for(int neighbour: map.get(e).keySet()){
                inDegreeArray[neighbour]++;
            }
        }
        System.out.println(Arrays.toString(inDegreeArray));
        return inDegreeArray;
    }

    public void topologicalSort(){
        Queue<Integer> q = new LinkedList<>();
        int[] inDegree = inDegree();
        for(int i = 0; i < inDegree.length; i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }
        while (!q.isEmpty()){
            int v = q.poll();
            System.out.print(v + " ");
            for(int neighbour: map.get(v).keySet()){
                inDegree[neighbour]--;
                if(inDegree[neighbour] == 0){
                    q.add(neighbour);
                }
            }
        }
    }
    public static void main(String[] args) {
        TopologicalSort ts = new TopologicalSort(7);
        ts.addEdge(1, 2);
        ts.addEdge(1, 0);
        ts.addEdge(1, 4);
        ts.addEdge(4, 3);
        ts.addEdge(3, 2);
        ts.addEdge(4, 5);
        ts.addEdge(5, 7);
        ts.addEdge(6, 3);
        ts.addEdge(6, 7);
        ts.topologicalSort();
    }
}
