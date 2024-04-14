package Graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class IsCyclic {
    private HashMap<Integer, HashMap<Integer, Integer>> map;
    public IsCyclic(int v){
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

    public boolean isCycle(){
        Queue<Integer> q = new LinkedList<>();
        int[] inDegree = inDegree();
        for(int i = 0; i < inDegree.length; i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }
        int c = 0;
        while (!q.isEmpty()){
            int v = q.poll();
            c++;
            System.out.print(v + " ");
            for(int neighbour: map.get(v).keySet()){
                inDegree[neighbour]--;
                if(inDegree[neighbour] == 0){
                    q.add(neighbour);
                }
            }
        }
        return c != map.size();
    }
    public static void main(String[] args) {
        IsCyclic ic = new IsCyclic(7);
        ic.addEdge(1, 2);
        ic.addEdge(1, 0);
//        ic.addEdge(0, 1);
        ic.addEdge(1, 4);
        ic.addEdge(4, 3);
        ic.addEdge(3, 2);
        ic.addEdge(4, 5);
        ic.addEdge(5, 7);
        ic.addEdge(6, 3);
        ic.addEdge(6, 7);
        System.out.println(ic.isCycle());
    }
}
