package com.c0ying.algorithm.s_24;

import com.c0ying.algorithm.ListNode;

public class Solution {

    public static ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode q = pre;
        ListNode p = head;
        while(p !=null && p.next != null){
            q.next = p.next;
            p.next = q.next.next;
            q.next.next = p;

            p = p.next;
            q = q.next.next;
        }
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        head.next = a;
        a.next = b;
        b.next = c;

        System.out.println(swapPairs(head));

    }
}
