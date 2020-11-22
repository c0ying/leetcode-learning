package com.c0ying.algorithm.s_47;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(nums, 0,  result);
        return result;
    }

    public void dfs(int[] nums, int start, List<List<Integer>> result){
        if (start == nums.length){
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                tmp.add(nums[i]);
            }
            result.add(tmp);
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (!canSwap(nums, start,i)){
                continue;
            }
            swap(nums, start, i);
            dfs(nums, start+1, result);
            swap(nums, start, i);
        }
    }

    private boolean canSwap(int nums[],int begin,int end) {
        for (int i = begin;i < end;i++) {
            if (nums[i] == nums[end]) {
                return false;
            }
        }

        return true;
    }

    private void swap(int nums[],int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.permuteUnique(new int[]{1, 1, 2}));
    }
}
