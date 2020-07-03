package com.c0ying.algorithm.s_108;

import com.c0ying.algorithm.TreeNode;

public class Solution {

    public static TreeNode sortedArrayToBST(int[] nums) {
        return treeBuildHelper(nums, 0, nums.length);
    }

    //含头不含尾
    private static TreeNode treeBuildHelper(int[] nums, int start, int end) {
        if (start >= end) {
            return null;
        }
        int mid = (end + start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = treeBuildHelper(nums, start, mid);
        root.right = treeBuildHelper(nums, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        TreeNode treeNode = sortedArrayToBST(nums);
        System.out.println(treeNode);
    }
}
