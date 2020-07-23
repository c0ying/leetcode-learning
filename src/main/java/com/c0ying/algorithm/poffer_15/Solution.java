package com.c0ying.algorithm.poffer_15;

public class Solution {
    public static int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        //assert result == 2;
        System.out.println(hammingWeight(9));
    }
}
