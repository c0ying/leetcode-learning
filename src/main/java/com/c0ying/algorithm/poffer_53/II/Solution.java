package com.c0ying.algorithm.poffer_53.II;

public class Solution {

    public static int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length;
        while(left < right){
            int mid = (left + right)/2;
            if(nums[mid] == mid){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left == nums.length-1 && nums[left] == left ? nums.length:left--;
    }

    public static void main(String[] args) {
        //assert result == 2;
        System.out.println(missingNumber(new int[]{0,1,3}));
        //assert result == 8;
        System.out.println(missingNumber(new int[]{0,1,2,3,4,5,6,7,9}));
    }
}
