package com.c0ying.algorithm.s941.II;

public class Solution {

    public static boolean validMountainArray(int[] A) {
        int n = A.length;
        int i = 0;
        while(i < n - 1 && A[i+1] > A[i]){
            i++;
        }
        if(i == n-1 || i == 0) return false;
        while(i < n-1 && A[i+1] < A[i]){
            i++;
        }
        return i==n-1? true : false;
    }

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{3,5,5}));
        System.out.println(validMountainArray(new int[]{0,3,2,1}));
        System.out.println(validMountainArray(new int[]{3,2,3,4}));
        System.out.println(validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9}));
    }
}
