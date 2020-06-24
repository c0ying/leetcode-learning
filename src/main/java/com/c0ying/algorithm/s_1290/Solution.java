package com.c0ying.algorithm.s_1290;

public class Solution {

    public static int getDecimalValue(ListNode head) {
        StringBuilder str = new StringBuilder();
        while(head!=null){
            str.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(str.toString(), 2);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(1);
        root.next = a;
        a.next = b;
        System.out.println(getDecimalValue(root));
    }
}
