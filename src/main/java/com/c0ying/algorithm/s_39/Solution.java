package com.c0ying.algorithm.s_39;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(candidates[i]);
            dfs(candidates, i, result, tmp, candidates[i], target);
        }
        return result;
    }

    public void dfs(int[] candidates, int start, List<List<Integer>> result, List<Integer> tmp, int sum, int target){
        if (sum == target){
            result.add(new ArrayList<>(tmp));
            return;
        }else if(sum > target){
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            tmp.add(candidates[i]);
            dfs(candidates, i, result, tmp, sum+candidates[i], target);
            tmp.remove(tmp.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum(new int[]{2, 3, 6, 7}, 7));
    }
}
