package com.c0ying.algorithm.s_647;

public class Solution {

    public static int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 0;
        for (int j = 0; j < s.length(); j++) {
            for (int i =0; i<=j; i++){
                if (i==j){
                    dp[i][j] = true;
                    count++;
                }else if (j-i == 1 && s.charAt(i) == s.charAt(j)){
                    dp[i][j]=true;
                    count++;
                }else if (j-i > 1 && s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j]=true;
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));
        System.out.println(countSubstrings("aaa"));
    }
}
