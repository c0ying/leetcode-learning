package com.c0ying.algorithm.s_167;

import java.util.Arrays;

public class Solution {

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        int[] result = new int[2];
        while(i < j){
            if (numbers[i]+ numbers[j] == target){
                result[0] = i+1;
                result[1] = j+1;
                return result;
            }else if(numbers[i] + numbers[j] > target){
                j--;
            }else if(numbers[i] + numbers[j] < target){
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
