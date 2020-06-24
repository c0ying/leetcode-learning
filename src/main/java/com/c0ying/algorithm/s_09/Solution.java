package com.c0ying.algorithm.s_09;

import java.util.Stack;

//#leetcode.09
public class Solution {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> tmp = new Stack<>();

    public Solution() {

    }

    public void appendTail(int value) {
        stack.push(value);
    }

    public int deleteHead() {
        if(tmp.isEmpty()){
            while(!stack.isEmpty()){
                tmp.push(stack.pop());
            }
        }

        if(tmp.isEmpty()){
            return -1;
        }else{
            return tmp.pop();
        }
    }
}
