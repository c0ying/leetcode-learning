package com.c0ying.algorithm.s_557;

public class Solution {

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] tmp = s.split(" ");
        for (int i = 0; i < tmp.length; i++) {
            for (int j = tmp[i].length()-1; j >=0; j--) {
                result.append(tmp[i].charAt(j));
            }
            if (i+1 < tmp.length){
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
