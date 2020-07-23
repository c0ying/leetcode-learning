package com.c0ying.algorithm.poffer_31;

import java.util.Stack;

public class Solution {

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s1 = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushed.length; i++) {
            s1.push(pushed[i]);
            while(j < popped.length && !s1.isEmpty() && s1.peek() == popped[j]){
                s1.pop();
                j++;
            }
        }
        return j == popped.length;
    }

    public static void main(String[] args) {
        System.out.println(validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4,5,3,2,1}));
        System.out.println(validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4,3,5,1,2}));
    }
}
