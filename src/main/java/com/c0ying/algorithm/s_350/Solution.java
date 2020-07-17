package com.c0ying.algorithm.s_350;

import java.util.Arrays;

public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int index = 0;
        int[] result = new int[Math.min(nums1.length,nums2.length)];
        while(i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]){
                i++;
            }else if (nums1[i] > nums2[j]){
                j++;
            }else{
                if (nums1[i] == nums2[j]){
                    result[index++] = nums1[i++];
                    j++;
                }
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }
}
