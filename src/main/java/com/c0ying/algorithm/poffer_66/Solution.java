package com.c0ying.algorithm.poffer_66;

import java.util.Arrays;

public class Solution {

    public static int[] constructArr(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0, product =1; i<a.length; product *= a[i],i++){
            result[i] = product;
        }
        for (int i = a.length-1, product = 1; i>=0 ; product *=a[i], i--){
            result[i] *= product;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructArr(new int[]{1,2,3,4,5})));
    }
}
