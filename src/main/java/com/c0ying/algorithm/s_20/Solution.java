package com.c0ying.algorithm.s_20;

import java.util.Stack;

public class Solution {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else {
                if(s.charAt(i) == ')' ){
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    }else{
                        return false;
                    }
                }else if(s.charAt(i) == '}' ){
                    if(!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    }else{
                        return false;
                    }
                }else if(s.charAt(i) == ']' ){
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean valid = isValid("{[]}");
        System.out.println(valid);
    }
}
