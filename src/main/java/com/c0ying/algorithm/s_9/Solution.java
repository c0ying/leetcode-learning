package com.c0ying.algorithm.s_9;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

    public static boolean isPalindrome(int x) {
        if(x <0 || x== 10) return false;
        if(x >=0 && x<=9) return true;
        Queue<Integer> data = new LinkedList<>();
        Stack<Integer> max = new Stack<>();
        Deque<Integer> a = new ArrayDeque<>();
        int tmp = x;
        while(tmp > 0){
            data.offer(tmp%10);
            tmp = tmp /10;
        }
        int reverNum = -1;
        while(!data.isEmpty()){
            reverNum = reverNum == -1? data.poll(): reverNum*10+data.poll();
        }
        if(reverNum == x) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(100));
    }

}
