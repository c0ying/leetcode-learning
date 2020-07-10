package com.c0ying.algorithm.s_11;

public class Solution {

    public static int minArray(int[] numbers) {
        for (int i =0; i<numbers.length; i++){
            if(i+1 < numbers.length){
                if(numbers[i] > numbers[i+1]){
                    return numbers[i+1];
                }
            }
        }
        return numbers[numbers.length-1];
    }

    public static void main(String[] args) {
        int r = minArray(new int[]{3, 4, 5, 1, 2});
        assert r == 1;
        System.out.println(r);
    }
}
