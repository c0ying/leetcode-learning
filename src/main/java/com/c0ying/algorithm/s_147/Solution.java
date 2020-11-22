package com.c0ying.algorithm.s_147;

import com.c0ying.algorithm.ListNode;

public class Solution {

    public static ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0), pre;
        dummy.next = head;

        while(head != null && head.next != null) {
            if(head.val <= head.next.val) {
                head = head.next;
                continue;
            }
            pre = dummy;

            while (pre.next.val < head.next.val) pre = pre.next;

            ListNode curr = head.next;
            head.next = curr.next;
            curr.next = pre.next;
            pre.next = curr;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
//        ListNode root = new ListNode(4);
//        ListNode a = new ListNode(2);
//        ListNode b = new ListNode(1);
//        ListNode c = new ListNode(3);
//        root.next = a;
//        a.next = b;
//        b.next = c;
        ListNode root = new ListNode(-1);
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(0);
        root.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        ListNode listNode = insertionSortList(root);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
