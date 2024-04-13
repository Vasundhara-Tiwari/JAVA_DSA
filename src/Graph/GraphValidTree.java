package Graph;

import java.util.*;

public class GraphValidTree {
    public boolean validTree(int n, int[][] edges){
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(i, new ArrayList<>());
        }
        for(int i = 0; i < n; i++){
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }
        return isValid(map);
    }
    public static boolean isValid(HashMap<Integer, List<Integer>> map){
        Stack<Integer> stack = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        int c = 0;
        for(int source: map.keySet()) {
            if(visited.contains(source)){
                continue;
            }
            c++;
            stack.push(source);
            while (!stack.isEmpty()){
                // 1. remove
                int r = stack.pop();   // remove first
                // 2. Ignore if already visited
                if(visited.contains(r)){
                    return false;
                }
                // 3. mark visited
                visited.add(r);
                // 4. self work
                System.out.print(r+" ");
                // 5. Add neighbour which are unvisited
                for(int neighbour: map.get(r)){
                    if (!visited.contains(neighbour)){
                        stack.push(neighbour);
                    }
                }
            }
        }
        return c == 1;
    }
}
