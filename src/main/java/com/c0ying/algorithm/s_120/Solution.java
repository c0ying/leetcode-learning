package com.c0ying.algorithm.s_120;

import java.util.List;

public class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> last = triangle.get(triangle.size()-1);
        int m = last.size();
        int[][] dp = new int[m][m];
        dp[0][0] = triangle.get(0).get(0);
        for (int i =1; i < triangle.size(); i++){
            dp[i][0] = dp[i-1][0] + triangle.get(i).get(0);
            for (int j =1; j < i; j++){
                dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-1]) + triangle.get(i).get(j);
            }
            dp[i][i] = dp[i-1][i-1] + triangle.get(i).get(i);
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i< dp[m-1].length;i++){
            result = Math.min(result, dp[m-1][i]);
        }
        return result;
    }

    public int minimumTotal2(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()+1];
        for (int i = triangle.size()-1; i>=0; i--){
            for (int j = 0; j<triangle.get(i).size(); j++){
                dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
    }
}
