package com.c0ying.algorithm.s_844;

import java.util.Arrays;
import java.util.Stack;

public class Solution {

    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> s = new Stack<>();
        Stack<Character> t = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#'){
                if (s.size() > 0){
                    s.pop();
                }
            }else{
                s.push(S.charAt(i));
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) == '#'){
                if (t.size() > 0){
                    t.pop();
                }
            }else{
                t.push(T.charAt(i));
            }
        }
        return Arrays.toString(s.toArray()).equals(Arrays.toString(t.toArray()))? true:false;
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
    }
}
