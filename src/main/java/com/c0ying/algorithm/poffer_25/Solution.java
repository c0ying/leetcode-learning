package com.c0ying.algorithm.poffer_25;

import com.c0ying.algorithm.ListNode;

public class Solution {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode p = head;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                head.next = l1;
                head = head.next;
                l1 = l1.next;
            }else{
                head.next = l2;
                head = head.next;
                l2 = l2.next;
            }
        }
        if(l1!=null){
            head.next = l1;
        }
        if(l2 != null){
            head.next = l2;
        }
        return p.next;
    }

    public static void main(String[] args) {
//        ListNode root1 = new ListNode(1);
//        ListNode a1 = new ListNode(2);
//        ListNode b1 = new ListNode(4);
//        root1.next=a1;
//        a1.next=b1;
//
//        ListNode root2 = new ListNode(1);
//        ListNode a2 = new ListNode(3);
//        ListNode b2 = new ListNode(4);
//        root2.next=a2;
//        a2.next=b2;
//
//        ListNode mergeList = mergeTwoLists(root1, root2);
//        System.out.println(mergeList);
        ListNode root1 = new ListNode(5);

        ListNode root2 = new ListNode(1);
        ListNode a2 = new ListNode(3);
        ListNode b2 = new ListNode(4);
        root2.next=a2;
        a2.next=b2;

        ListNode mergeList = mergeTwoLists(root1, root2);
        System.out.println(mergeList);
    }
}
