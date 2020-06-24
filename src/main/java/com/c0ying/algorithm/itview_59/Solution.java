package com.c0ying.algorithm.itview_59;

import java.util.Deque;
import java.util.LinkedList;

//#面试题59
public class Solution {

    Deque<Integer> queue;
    Deque<Integer> maxQue;
    public Solution() {
        queue = new LinkedList<>();
        maxQue = new LinkedList<>();
    }

    public int max_value() {
        return maxQue.isEmpty() ? -1 : maxQue.peekFirst();
    }

    public void push_back(int value) {
        queue.addLast(value);
        while (!maxQue.isEmpty() && maxQue.peekLast() < value) {
            maxQue.pollLast();
        }
        maxQue.addLast(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) return -1;
        int pop = queue.pollFirst();
        if (pop == maxQue.peekFirst()) {
            maxQue.pollFirst();
        }
        return pop;
    }
}
