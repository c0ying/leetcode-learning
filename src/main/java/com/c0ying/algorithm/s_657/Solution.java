package com.c0ying.algorithm.s_657;

public class Solution {

    public static boolean judgeCircle(String moves) {
        int row = 0, col = 0;
        for (int i = 0; i < moves.length(); i++) {
            char instruct = moves.charAt(i);
            if (instruct == 'U'){
                row--;
            }else if (instruct == 'D'){
                row++;
            }else if (instruct == 'L'){
                col--;
            }else if (instruct == 'R'){
                col++;
            }
        }
        return row==0&&col==0?true:false;
    }

    public static void main(String[] args) {
        //true
        System.out.println(judgeCircle("UD"));
        //false
        System.out.println(judgeCircle("LL"));
    }
}
