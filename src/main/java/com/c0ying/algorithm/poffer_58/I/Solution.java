package com.c0ying.algorithm.poffer_58.I;

public class Solution {

    public static String reverseLeftWords(String s, int n) {
        if (s.length() == n) return s;
        StringBuilder str = new StringBuilder();
        for (int i = n; i < s.length(); i++){
            str.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++){
            str.append(s.charAt(i));
        }
        return  str.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg", 2));
    }
}

