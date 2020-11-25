package com.c0ying.algorithm.s_922;

import java.util.Arrays;

public class Solution {

    public static int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length; i+=2) {
            if (A[i] %2 == 1){
                while(A[j] % 2 == 1){
                    j+=2;
                }
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{4,2,5,7})));
    }
}
