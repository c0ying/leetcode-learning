package com.c0ying.algorithm.s_216;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(1, n, k, 0, new ArrayList<>(), result);
        return result;
    }

    public void dfs(int start, int n, int k, int sum, List<Integer> tmp, List<List<Integer>> result){
        if (k ==0&&n==sum){
            result.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i <= 9; i++) {
            tmp.add(i);
            dfs(i+1, n,k-1, sum+i, tmp, result);
            tmp.remove(tmp.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum3(3, 7));
        System.out.println(solution.combinationSum3(3, 9));
    }
}
