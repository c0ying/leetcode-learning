package com.c0ying.algorithm.poffer_53.I;

public class Solution {

    public static int search(int[] nums, int target) {
        int count =0;
        int left = 0;
        int right = nums.length;
        while(left < right){
            int mid = (right + left) /2;
            if (nums[mid] < target){
                left = mid+1;
            }
            if (nums[mid] >=target){
                right = mid;
            }
        }
        while (left <= nums.length && nums[left] == target){
            count++;
            left++;
        }
        return count;
    }

    public static void main(String[] args) {
        //assert result == 2;
        System.out.println(search(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }
}
