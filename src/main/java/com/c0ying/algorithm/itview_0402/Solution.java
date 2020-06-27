package com.c0ying.algorithm.inter_0402;

import com.c0ying.algorithm.TreeNode;

import java.util.Arrays;

public class Solution {

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        if(nums.length == 1) return new TreeNode(nums[0]);
        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid+1, nums.length));
        return root;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10,-3,0,5,9};
        TreeNode treeNode = sortedArrayToBST(nums);
        System.out.println(treeNode);
    }
}
