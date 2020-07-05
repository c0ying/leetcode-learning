package com.c0ying.algorithm.s_44;

public class Solution {

    public static boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[p.length()+1][s.length()+1];
        dp[0][0] = true;
        for (int i=1; i <= p.length(); i++){
            if (p.charAt(i-1) != '*'){
                break;
            }
            dp[i][0]=true;
        }

        for (int i=1; i<= p.length(); i++){
            for (int j=1; j<= s.length(); j++){
                if(p.charAt(i-1) == s.charAt(j-1) || p.charAt(i-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }else if (p.charAt(i-1) == '*'){
                    dp[i][j] = dp[i][j-1] | dp[i-1][j];
                }
            }
        }
        return dp[p.length()][s.length()];
    }

    public static void main(String[] args) {
        boolean flag = isMatch("adceb", "*a*b");
        assert flag == true;
        System.out.println(flag);
    }
}
