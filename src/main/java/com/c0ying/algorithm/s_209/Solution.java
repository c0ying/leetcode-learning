package com.c0ying.algorithm.s_209;

public class Solution {

    public static int minSubArrayLen(int s, int[] nums) {
        int sum = 0;
        int len = 0;
        for (int i=0, j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= s) {
                len = len == 0 ? j - i + 1 : Math.min(len, j - i + 1);
                sum -= nums[i++];
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int i = minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        System.out.println(i);
        assert i == 2;
    }
}
