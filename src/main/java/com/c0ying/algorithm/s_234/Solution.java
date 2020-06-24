package com.c0ying.algorithm.s_234;

public class Solution {

    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head, prev = null;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        while(slow != null){
            ListNode tmp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = tmp;
        }
        while(head != null && prev != null){
            if(head.val != prev.val){
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
//        ListNode root = new ListNode(1);
//        ListNode a = new ListNode(2);
//        ListNode b = new ListNode(2);
//        ListNode c = new ListNode(1);
//        root.next = a;
//        a.next = b;
//        b.next = c;
        ListNode root = new ListNode(1);
        ListNode a = new ListNode(2);
        root.next = a;

        System.out.println(isPalindrome(root));

    }
}
