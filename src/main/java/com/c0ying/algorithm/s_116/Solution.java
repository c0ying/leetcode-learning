package com.c0ying.algorithm.s_116;

import com.c0ying.algorithm.Node;

public class Solution {

    public Node connect(Node root) {
        if(root == null) return null;
        Node cur = root;
        while (cur != null){
            Node head = new Node(-1);
            Node p = head;
            while (cur != null){
                if (cur.left != null){
                    p.next = cur.left;
                    p = p.next;
                }

                if (cur.right != null){
                    p.next = cur.right;
                    p = p.next;
                }
                cur = cur.next;
            }
            cur = head.next;
        }
        return root;
    }
}
