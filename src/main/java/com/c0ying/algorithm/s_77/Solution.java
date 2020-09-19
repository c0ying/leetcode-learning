package com.c0ying.algorithm.s_77;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(i);
            dfs(i+1, n, k-1, tmp, result);
        }
        return result;
    }

    public void dfs(int start, int n, int k, List<Integer> tmp, List<List<Integer>> result){
        if (k ==0){
            result.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i <= n; i++) {
            tmp.add(i);
            dfs(i+1, n, k-1, tmp, result);
            tmp.remove(tmp.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combine(3, 3));
        System.out.println(solution.combine(4, 2));
    }
}
