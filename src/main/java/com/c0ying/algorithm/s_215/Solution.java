package com.c0ying.algorithm.s_215;

import java.util.Arrays;

public class Solution {

    //快排解决TOP K 问题
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
