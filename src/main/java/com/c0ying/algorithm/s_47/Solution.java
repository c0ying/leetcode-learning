package com.c0ying.algorithm.s_47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public void dfs(int[] nums, int start, List<Integer> tmp, List<List<Integer>> result){
        if (start == nums.length){
            result.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (i > 0 && nums[i-1] == nums[i]){
                continue;
            }
            tmp.add(nums[i]);
            dfs(nums, start+1, tmp, result);
            tmp.remove(tmp.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.permuteUnique(new int[]{1, 1, 2}));
    }
}
