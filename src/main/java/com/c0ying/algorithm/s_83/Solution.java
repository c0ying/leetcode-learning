package com.c0ying.algorithm.s_83;

public class Solution {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode flag = head;
        while(flag != null && flag.next != null){
            if (flag.val == flag.next.val){
                flag.next = flag.next.next;
            }else{
                flag = flag.next;
            }
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
//        ListNode root = new ListNode(1);
//        ListNode a = new ListNode(1);
//        ListNode b = new ListNode(2);
//        ListNode c = new ListNode(3);
//        ListNode d = new ListNode(3);
//        root.next = a;
//        a.next = b;
//        b.next = c;
//        c.next = d;
        ListNode root = new ListNode(1);
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        root.next = a;
        a.next = b;
        ListNode listNode = deleteDuplicates(root);
        System.out.println(listNode);
    }
}
