package Q0133_CloneGraph;

import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        // 1. build HashMap maps `val` to `neighbors Val list`
        // 2. build HashMap maps `val` to new Node
        Map<Integer, Node> val2newNode = new HashMap<>();
        Map<Integer, List<Integer>> val2neighbors = new HashMap<>();
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while (!q.isEmpty()) {
            Queue<Node> p = new ArrayDeque<>();
            for (Node cur : q) {
                if (val2neighbors.containsKey(cur.val)) continue;
                val2neighbors.put(cur.val, cur.neighbors.stream().map(n -> n.val).toList());
                p.addAll(cur.neighbors);

                val2newNode.put(cur.val, new Node(cur.val));
            }
            q = p;
        }

        // update new Node's neighbours with `val2neighbors`
        val2neighbors.forEach((val, neighborVals) -> {
            Node valNode = val2newNode.get(val);
            for (Integer neighborVal : neighborVals) {
                Node neighborNode = val2newNode.get(neighborVal);
                valNode.neighbors.add(neighborNode);
            }
            val2newNode.put(val, valNode);
        });

        // return the "first" node
        return val2newNode.get(node.val);
    }
}