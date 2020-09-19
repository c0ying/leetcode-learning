package com.c0ying.algorithm.s_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, 0, result, new ArrayList<>(), 0, target);
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
            // 小剪枝：同一层相同数值的结点，从第 2 个开始，候选数更少，结果一定发生重复，因此跳过，用 continue
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            tmp.add(candidates[i]);
            dfs(candidates, i+1, result, tmp, sum+candidates[i], target);
            tmp.remove(tmp.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
    }
}
