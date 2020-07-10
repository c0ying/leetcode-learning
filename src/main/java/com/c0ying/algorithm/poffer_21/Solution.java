package com.c0ying.algorithm.poffer_21;

import java.util.Arrays;

public class Solution {

    public static int[] exchange(int[] nums) {
        int left = 0; int right = nums.length-1;
        while(left < right){
            while(nums[left] % 2 != 0){
                if(left>=right) break;
                left++;
            }
            while(nums[right] % 2 == 0){
                if(left>=right) break;
                right--;
            }
            if(left<right){
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right]=tmp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] exchange = exchange(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(exchange));
    }
}
