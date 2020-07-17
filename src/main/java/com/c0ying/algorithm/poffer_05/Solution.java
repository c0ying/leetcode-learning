package com.c0ying.algorithm.poffer_05;

public class Solution {

    public String replaceSpace(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                str.append(s.charAt(i));
            }else{
                str.append("%20");
            }
        }
        return str.toString();
    }
}
