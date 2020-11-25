package com.c0ying.algorithm.s_349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> cross = new HashSet<>();
        Set<Integer> resultList = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            cross.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (cross.contains(nums2[i])){
                resultList.add(nums2[i]);
            }
        }
        int[] result = new int[resultList.size()];
        int i =0;
        for (Integer integer : resultList) {
            result[i++] = integer;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1}, new int[]{2,2})));
    }
}
