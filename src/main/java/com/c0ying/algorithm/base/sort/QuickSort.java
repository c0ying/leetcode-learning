package com.c0ying.algorithm.base.sort;

/**
 * 快速排序
 * 两端分别向中间靠拢
 * 右端遇到比基准值小的进行交换
 * 左端遇到比基准值大的进行交换
 */
public class QuickSort {

    public static int sort(int[] nums, int l, int r){
        int flag = nums[l];
        while(l<r){
            while(l<r && nums[r] >= flag){
                r--;
            }
            nums[l] = nums[r];
            while(l<r && nums[l] <= flag){
                l++;
            }
            nums[r]=nums[l];
        }
        nums[l] = flag;
        return l;
    }

    public static void quickSort(int[] nums, int l, int r){
        if (l < r){
            int mid = sort(nums, l, r);
            quickSort(nums, l, mid);
            quickSort(nums, mid+1, r);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{5,7,9,10,6,4,3,1,2};
        quickSort(array, 0, array.length-1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
    }
}
