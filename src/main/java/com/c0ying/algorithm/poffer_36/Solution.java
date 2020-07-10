package com.c0ying.algorithm.poffer_36;

import com.c0ying.algorithm.Node;

public class Solution {

    static Node p = new Node(-1);
    static Node head = p;
    public static Node treeToDoublyList(Node root) {
        if(root == null) return null;
        travelTree(root);
        head.right = p.right;
        p.right.left = head;
        return p.right;
    }

    public static void travelTree(Node root){
        if(root == null) return;
        travelTree(root.left);
        head.right = root;
        root.left = head;
        head = head.right;
        travelTree(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(3);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        Node node = treeToDoublyList(root);
        System.out.println(node);
    }
}
