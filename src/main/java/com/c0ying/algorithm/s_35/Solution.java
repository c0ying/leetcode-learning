package com.c0ying.algorithm.s_35;

public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left <= right){
            int mid = (left+right) / 2;
            if (nums[mid] == target){
                return mid;
            }
            if(target > nums[mid]){
                left = mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int r1 = searchInsert(new int[]{1, 3, 5, 6}, 5);
        //assert r1 == 2
        System.out.println(r1);
        int r2 = searchInsert(new int[]{1, 3, 5, 6}, 2);
        //assert r2 == 1
        System.out.println(r2);
        int r3 = searchInsert(new int[]{1, 3, 5, 6}, 7);
        //assert r2 == 4
        System.out.println(r3);
        int r4 = searchInsert(new int[]{1, 3, 5, 6}, 0);
        //assert r2 == 0
        System.out.println(r4);
    }
}
