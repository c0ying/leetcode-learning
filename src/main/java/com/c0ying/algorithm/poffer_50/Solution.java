package com.c0ying.algorithm.poffer_50;

import java.util.HashMap;

public class Solution {

    public static char firstUniqChar(String s) {
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc)
            dic.put(c, !dic.containsKey(c));
        for(char c : sc)
            if(dic.get(c)) return c;
        return ' ';
    }

    public static void main(String[] args) {
        //assert result == b;
        System.out.println(firstUniqChar("abaccdeff"));
        //assert result == ' ';
        System.out.println(firstUniqChar(""));
        //assert result == ' ';
        System.out.println(firstUniqChar("cc"));
    }
}
