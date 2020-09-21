package com.c0ying.algorithm.s_109;

import com.c0ying.algorithm.ListNode;
import com.c0ying.algorithm.TreeNode;

public class Solution {

    public static TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);
        ListNode pre = head;
        ListNode p = head;
        ListNode q = head;
        while (q != null && q.next != null){
            pre = p;
            p=p.next;
            q=q.next.next;
        }
        pre.next = null;
        TreeNode root = new TreeNode(p.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(p.next);
        return root;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(-10);
        ListNode a = new ListNode(-3);
        ListNode b = new ListNode(0);
        ListNode c = new ListNode(5);
        ListNode d = new ListNode(9);
        root.next = a;
        a.next = b;
        b.next = c;
        c.next = d;

        TreeNode treeNode = sortedListToBST(root);
        System.out.println(treeNode);
    }
}
