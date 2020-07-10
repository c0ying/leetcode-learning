package com.c0ying.algorithm.itview_1611;

import java.util.Arrays;

public class Solution {

    public static int[] divingBoard(int shorter, int longer, int k) {
        if(k == 0) return new int[0];
        int[] result = null;
        if (shorter == longer){
            result = new int[1];
            result[0] = shorter*k;
        }else{
            result = new int[k+1];
            for (int i=0; k>=0;k--,i++ ){
                result[i]=shorter*k+longer*i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = divingBoard(1, 2, 3);
        System.out.println(Arrays.toString(result));
    }
}
