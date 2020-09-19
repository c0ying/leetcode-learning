package com.c0ying.algorithm.s_78;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            dfs(nums, 0, i, new ArrayList<>(), result);
        }
        return result;
    }

    public void dfs(int[] nums, int start, int step, List<Integer> tmp, List<List<Integer>> result){
        if (start == step){
            result.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            tmp.add(nums[i]);
            dfs(nums, i+1, step, tmp, result);
            tmp.remove(tmp.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subsets(new int[]{1, 2, 3}));
    }
}
