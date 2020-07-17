package com.c0ying.algorithm.s_96;

public class Solution {

    public static int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        //左子树 BST 用j个节点，右子树 BST 用i-j-1个节点，能构建出dp[j] * dp[i-j-1]种不同的BST
        for (int i=2; i<=n; i++){
            for (int j = 0; j < i;j++){
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int result = numTrees(3);
        System.out.println(result);
    }
}
