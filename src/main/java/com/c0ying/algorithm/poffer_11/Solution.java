package com.c0ying.algorithm.poffer_11;

public class Solution {

    public static int minArray(int[] numbers) {
        int i =0, j = numbers.length-1;
        while(i<j){
            int mid = (i+j) / 2;
            if (numbers[mid] > numbers[j]){
                i = mid+1;
            }else if(numbers[mid] < numbers[j]){
                j=mid;
            }else{
                j--;
            }
        }
        return numbers[i];
    }

    public static void main(String[] args) {
        //assert result == 1
        System.out.println(minArray(new int[]{3,4,5,1,2}));
        //assert result == 0
        System.out.println(minArray(new int[]{2,2,2,0,1}));
    }
}
