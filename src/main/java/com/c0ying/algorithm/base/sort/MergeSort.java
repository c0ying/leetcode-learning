package com.c0ying.algorithm.base.sort;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {

    public static int[] mergesort(int[] nums, int li, int ri){
        if(ri-li == 1){
            return nums;
        }
        int mid = (li+ri) / 2;
        mergesort(nums, li, mid);
        mergesort(nums, mid, ri);
        merge(nums, li, mid, ri);
        return nums;
    }

    public static void merge(int[] nums, int li, int mid, int ri){
        int i = li;
        int j = mid;
        int k = 0;
        int[] result = new int[ri-li];
        while(i < mid && j < ri){
            if(nums[i] < nums[j]){
                result[k++]=nums[i++];
            }else{
                result[k++]=nums[j++];
            }
        }
        for(; i<mid; i++){
            result[k++] = nums[i];
        }
        for(; j<ri; j++){
            result[k++] = nums[j];
        }
        for(i=li,k=0; k<result.length;){
            nums[i++]=result[k++];
        }
    }

    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1};
        int[] mergesort = mergesort(nums, 0, nums.length);
        System.out.println(Arrays.toString(mergesort));
    }
}
