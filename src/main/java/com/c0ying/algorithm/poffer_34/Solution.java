package com.c0ying.algorithm.poffer_34;

import com.c0ying.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        helper(root, result, new ArrayList<>(), sum);
        System.out.println(result);
        return result;
    }

    public void helper(TreeNode root,List<List<Integer>> result, List<Integer> step, int sum){
        if (root == null) return;
        if(step.stream().count() == sum && root.left == null && root.right == null){
            result.add(new ArrayList<>(step));
            return;
        }else{
            helper(root.left, result, step, sum);
            helper(root.right, result, step, sum);
        }
        step.remove(step.size() - 1);
    }
}
