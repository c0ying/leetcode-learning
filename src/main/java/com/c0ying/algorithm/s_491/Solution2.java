package com.c0ying.algorithm.s_491;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 很妙的回溯法+剪枝
 */
public class Solution2 {

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(0,Integer.MIN_VALUE, nums, new ArrayList<>(), result);
        return result.stream().collect(Collectors.toList());
    }

    public void dfs(int startIndex, int last, int[] nums, List<Integer> path, List<List<Integer>> result){
        if (startIndex == nums.length){
            if (path.size() >= 2){
                result.add(path);
            }
            return;
        }
        if (nums[startIndex] >= last){
            path.add(nums[startIndex]);
            dfs(startIndex+1, nums[startIndex], nums, new ArrayList<>(path), result);
            path.remove(path.size()-1);
        }
        if (nums[startIndex] != last){
            dfs(startIndex+1, last, nums, new ArrayList<>(path), result);
        }
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.findSubsequences(new int[]{4, 6, 7, 7}));
    }
}
