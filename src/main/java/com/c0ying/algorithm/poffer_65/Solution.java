package com.c0ying.algorithm.poffer_65;

public class Solution {

    public static int add(int a, int b) {
        while (b!=0){
            int tmp = a^b;
            b=(a&b)<<1;
            a=tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(add(9, 13));
    }
}
