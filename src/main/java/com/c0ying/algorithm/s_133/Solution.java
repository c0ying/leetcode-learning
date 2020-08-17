package com.c0ying.algorithm.s_133;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Map<Integer, Node> cache = new HashMap<>();
        return dfs(cache, node);
    }

    public Node dfs(Map<Integer, Node> cache, Node node){
        Node root = null;
        if (cache.containsKey(node.val)){
            return cache.get(node.val);
        }else{
            root = new Node(node.val);
            cache.put(node.val, root);
        }
        for (Node neighbor: node.neighbors){
            root.neighbors.add(dfs(cache, neighbor));
        }
        return root;
    }

    public static void main(String[] args) {

    }
}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
