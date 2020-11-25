package com.c0ying.algorithm.s_142;

import com.c0ying.algorithm.ListNode;

public class Solution {

    public static ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                break;
            }
        }
        if (fast == slow){
            ListNode p = head;
            while(p != slow){
                p = p.next;
                slow = slow.next;
            }
            return p;
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        head.next = n1;
        n1.next = head;
        System.out.println(detectCycle(head));
    }
}
