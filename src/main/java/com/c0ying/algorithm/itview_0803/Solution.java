package com.c0ying.algorithm.itview_0803;

public class Solution {

    public static int getAnswer(int[] nums, int left, int right){
        if (left > right){
            return -1;
        }
        int mid = (left+right)/2;
        int leftAnswer = getAnswer(nums, left, mid-1);
        if (leftAnswer != -1){
            return leftAnswer;
        }else if (nums[mid] == mid){
            return mid;
        }
        return getAnswer(nums, mid+1,right);
    }

    public static int findMagicIndex(int[] nums) {
        return getAnswer(nums, 0, nums.length-1);
    }

    public static void main(String[] args) {
        System.out.println(findMagicIndex(new int[]{0, 2, 3, 4, 5}));
        System.out.println(findMagicIndex(new int[]{1,1,1}));
    }
}
