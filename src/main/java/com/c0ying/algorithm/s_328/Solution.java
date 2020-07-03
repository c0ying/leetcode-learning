package com.c0ying.algorithm.s_328;

import com.c0ying.algorithm.ListNode;

/**
 * 奇偶链表
 * 拆两个链表然后再合并
 */
public class Solution {

    public static ListNode oddEvenList(ListNode head) {
        ListNode o = head;
        ListNode p = head.next;
        ListNode e = p;
        while(o.next != null && e.next != null){
            o.next = e.next;
            o = o.next;
            e.next = o.next;
            e = e.next;
        }
        o.next = p;
        return head;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        root.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        ListNode listNode = oddEvenList(root);
        System.out.println(listNode);
    }
}
