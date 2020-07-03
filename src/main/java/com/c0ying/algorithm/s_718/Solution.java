package com.c0ying.algorithm.s_718;

public class Solution {

    public static int findLength(int[] A, int[] B) {
        int[][] dp = new int[B.length+1][A.length+1];
        int max = 0;
        for (int i =1; i < A.length+1; i++){
            for (int j=1; j < B.length+1; j++){
                if (A[i-1] == B[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1,2,3,2,1};
        int[] B = new int[]{3,2,1,4,7};
        int length = findLength(A, B);
        System.out.println(length);
        assert length == 3;
    }
}
