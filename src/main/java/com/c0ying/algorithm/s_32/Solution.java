package com.c0ying.algorithm.s_32;

import java.util.Stack;

public class Solution {

    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        stack.push(-1);
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                stack.push(i);
            }else if(s.charAt(i) == ')'){
                stack.pop();
                if (stack.empty()){
                    stack.push(i);
                }else{
                    max = Math.max(max,i-stack.peek());
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int i = longestValidParentheses("(()");
        assert i == 2;
        System.out.println(i);
        int j = longestValidParentheses(")()())");
        assert j == 4;
        System.out.println(j);
    }
}
