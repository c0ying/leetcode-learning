package com.c0ying.algorithm.itview_0201;

import com.c0ying.algorithm.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static ListNode removeDuplicateNodes(ListNode head) {
        Map<Integer, Boolean> indexMap = new HashMap<>();
        ListNode root = head;
        ListNode prev = head;
        while (root!=null){
            if (indexMap.containsKey(root.val)){
                root = root.next;
                prev.next = root;
            }else{
                indexMap.put(root.val, true);
                prev = root;
                root = root.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(1);
        root.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        ListNode listNode = removeDuplicateNodes(root);
        System.out.println(listNode);
    }
}
