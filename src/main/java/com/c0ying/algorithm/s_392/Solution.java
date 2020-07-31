package com.c0ying.algorithm.s_392;

public class Solution {

    public static boolean isSubsequence(String s, String t) {
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (j >= s.length()){
                break;
            }
            if (t.charAt(i) == s.charAt(j)){
                j++;
            }
        }
        return j >= s.length();
    }

    public static void main(String[] args) {
        //assert result == true
        System.out.println(isSubsequence("abc", "ahbgdc"));
        //assert result == false
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }
}
