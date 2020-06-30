package com.c0ying.algorithm.base.sort;

import java.util.Arrays;

/**
 * 堆排序
 */
public class HeapSort {

    public static void buildHeap(int[] nums,int j,int length){
        int tmp = nums[j];
        for(int i = j*2 +1; i< length; i = i*2+1){
            if(i+1 < length && nums[i] < nums[i+1]){
                i++;
            }
            if(nums[i] > tmp){
                nums[j] = nums[i];
                j=i;
            }else{
                break;
            }
        }
        nums[j] = tmp;
    }

    public static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void heapsort(int[] nums){
        //1.构建大顶堆
        for(int i=nums.length/2-1;i>=0;i--){
            //从第一个非叶子结点从下至上，从右至左调整结构
            buildHeap(nums,i,nums.length);
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for(int j=nums.length-1;j>0;j--){
            swap(nums,0,j);//将堆顶元素与末尾元素进行交换
            buildHeap(nums,0,j);//重新对堆进行调整
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        heapsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
