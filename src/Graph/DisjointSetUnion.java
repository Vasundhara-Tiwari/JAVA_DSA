package Graph;

import java.util.HashMap;

public class DisjointSetUnion {
    class Node{
        int rank;
        Node parent;
        int data;
    }

    HashMap<Integer, Node> map = new HashMap<>();

    public void createSet(int v){
        Node nn = new Node();
        nn.rank = 0;
        nn.parent = nn;
        nn.data = v;
        map.put(v, nn);
    }

    public int find(int v){
        Node nn = map.get(v);
        return find(nn).data;
    }

    public Node find(Node nn){
        if(nn.parent == nn){
            return nn;
        }
        Node n = find(nn.parent);
        nn.parent = n;      // path compression
        return n;
    }

    public void union(int v1, int v2){
        Node nn1 = map.get(v1);
        Node nn2 = map.get(v2);
        Node representativeNode1 = find(nn1);
        Node representativeNode2 = find(nn2);
        if(representativeNode1.rank == representativeNode2.rank){
            representativeNode1.parent = representativeNode2;
            representativeNode2.rank++;
        } else if (representativeNode1.rank > representativeNode2.rank) {
            representativeNode2.parent = representativeNode1;
        } else {
            representativeNode1.parent = representativeNode2;
        }
    }
}