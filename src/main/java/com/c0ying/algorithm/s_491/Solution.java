package com.c0ying.algorithm.s_491;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        dfs(0, nums, new ArrayList<>(), result);
        return result.stream().collect(Collectors.toList());
    }

    public void dfs(int startIndex, int[] nums, List<Integer> path, Set<List<Integer>> result){
        if (path.size() >= 2){
            result.add(path);
        }
        for (int i=startIndex; i<nums.length;i++){
            if (!path.isEmpty() && path.get(path.size()-1) > nums[i]) continue;
            path.add(nums[i]);
            dfs(i+1, nums, new ArrayList<>(path), result);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findSubsequences(new int[]{4, 6, 7, 7}));
    }
}
