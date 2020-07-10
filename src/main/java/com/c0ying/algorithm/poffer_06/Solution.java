package com.c0ying.algorithm.poffer_06;

import com.c0ying.algorithm.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static int[] reversePrint(ListNode head) {
        List<Integer> array = new ArrayList<>();
        build(head, array);
        int[] tmp = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            tmp[i] = array.get(i);
        }
        return tmp;
    }

    public static void build(ListNode head, List<Integer> array){
        if(head == null) return;
        build(head.next, array);
        array.add(head.val);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        head.next = a;
        a.next = b;

        int[] result = reversePrint(head);
        System.out.println(Arrays.toString(result));
    }
}
