package com.c0ying.algorithm.base.sort;

import java.util.Arrays;

public class InsertSort {

    public static int[] sort(int[] arrays){
        for (int i = 1; i < arrays.length; i++) {
            int z = i;
            for (int j = i-1; j >=0; j--) {
                if (arrays[j] > arrays[z]){
                    int tmp = arrays[j];
                    arrays[j] = arrays[z];
                    arrays[z] = tmp;
                    z--;
                }
            }
        }
        return arrays;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{4,2,1,3})));
    }
}
